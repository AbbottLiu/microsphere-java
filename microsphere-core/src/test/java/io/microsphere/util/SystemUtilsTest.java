/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.microsphere.util;

import org.junit.Test;

import static io.microsphere.util.SystemUtils.FILE_ENCODING;
import static io.microsphere.util.SystemUtils.FILE_ENCODING_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.FILE_SEPARATOR;
import static io.microsphere.util.SystemUtils.FILE_SEPARATOR_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_CLASS_PATH;
import static io.microsphere.util.SystemUtils.JAVA_CLASS_PATH_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_CLASS_VERSION;
import static io.microsphere.util.SystemUtils.JAVA_CLASS_VERSION_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_COMPILER;
import static io.microsphere.util.SystemUtils.JAVA_COMPILER_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_EXT_DIRS;
import static io.microsphere.util.SystemUtils.JAVA_EXT_DIRS_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_HOME;
import static io.microsphere.util.SystemUtils.JAVA_HOME_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_IO_TMPDIR;
import static io.microsphere.util.SystemUtils.JAVA_IO_TMPDIR_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_LIBRARY_PATH;
import static io.microsphere.util.SystemUtils.JAVA_LIBRARY_PATH_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_SPECIFICATION_NAME;
import static io.microsphere.util.SystemUtils.JAVA_SPECIFICATION_NAME_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_SPECIFICATION_VENDOR;
import static io.microsphere.util.SystemUtils.JAVA_SPECIFICATION_VENDOR_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_SPECIFICATION_VERSION;
import static io.microsphere.util.SystemUtils.JAVA_SPECIFICATION_VERSION_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_VENDOR;
import static io.microsphere.util.SystemUtils.JAVA_VENDOR_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_VENDOR_URL;
import static io.microsphere.util.SystemUtils.JAVA_VENDOR_URL_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_VERSION;
import static io.microsphere.util.SystemUtils.JAVA_VERSION_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_VM_NAME;
import static io.microsphere.util.SystemUtils.JAVA_VM_NAME_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_VM_SPECIFICATION_NAME;
import static io.microsphere.util.SystemUtils.JAVA_VM_SPECIFICATION_NAME_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_VM_SPECIFICATION_VENDOR;
import static io.microsphere.util.SystemUtils.JAVA_VM_SPECIFICATION_VENDOR_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_VM_SPECIFICATION_VERSION;
import static io.microsphere.util.SystemUtils.JAVA_VM_SPECIFICATION_VERSION_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_VM_VENDOR;
import static io.microsphere.util.SystemUtils.JAVA_VM_VENDOR_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.JAVA_VM_VERSION;
import static io.microsphere.util.SystemUtils.JAVA_VM_VERSION_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.LINE_SEPARATOR;
import static io.microsphere.util.SystemUtils.LINE_SEPARATOR_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.OS_ARCH;
import static io.microsphere.util.SystemUtils.OS_ARCH_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.OS_NAME;
import static io.microsphere.util.SystemUtils.OS_NAME_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.OS_VERSION;
import static io.microsphere.util.SystemUtils.OS_VERSION_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.PATH_SEPARATOR;
import static io.microsphere.util.SystemUtils.PATH_SEPARATOR_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.USER_DIR;
import static io.microsphere.util.SystemUtils.USER_DIR_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.USER_HOME;
import static io.microsphere.util.SystemUtils.USER_HOME_PROPERTY_KEY;
import static io.microsphere.util.SystemUtils.USER_NAME;
import static io.microsphere.util.SystemUtils.USER_NAME_PROPERTY_KEY;
import static org.junit.Assert.assertEquals;

/**
 * {@link SystemUtils} Test
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy<a/>
 * @see 1.0.0
 * @since 1.0.0
 */
public class SystemUtilsTest {

    @Test
    public void testSystemPropertyKeys() {
        assertEquals("java.version", JAVA_VERSION_PROPERTY_KEY);
        assertEquals("java.vendor", JAVA_VENDOR_PROPERTY_KEY);
        assertEquals("java.vendor.url", JAVA_VENDOR_URL_PROPERTY_KEY);
        assertEquals("java.home", JAVA_HOME_PROPERTY_KEY);
        assertEquals("java.vm.specification.version", JAVA_VM_SPECIFICATION_VERSION_PROPERTY_KEY);
        assertEquals("java.vm.specification.vendor", JAVA_VM_SPECIFICATION_VENDOR_PROPERTY_KEY);
        assertEquals("java.vm.specification.name", JAVA_VM_SPECIFICATION_NAME_PROPERTY_KEY);
        assertEquals("java.vm.version", JAVA_VM_VERSION_PROPERTY_KEY);
        assertEquals("java.vm.vendor", JAVA_VM_VENDOR_PROPERTY_KEY);
        assertEquals("java.vm.name", JAVA_VM_NAME_PROPERTY_KEY);
        assertEquals("java.specification.version", JAVA_SPECIFICATION_VERSION_PROPERTY_KEY);
        assertEquals("java.specification.vendor", JAVA_SPECIFICATION_VENDOR_PROPERTY_KEY);
        assertEquals("java.specification.name", JAVA_SPECIFICATION_NAME_PROPERTY_KEY);
        assertEquals("java.class.version", JAVA_CLASS_VERSION_PROPERTY_KEY);
        assertEquals("java.class.path", JAVA_CLASS_PATH_PROPERTY_KEY);
        assertEquals("java.library.path", JAVA_LIBRARY_PATH_PROPERTY_KEY);
        assertEquals("java.io.tmpdir", JAVA_IO_TMPDIR_PROPERTY_KEY);
        assertEquals("java.compiler", JAVA_COMPILER_PROPERTY_KEY);
        assertEquals("java.ext.dirs", JAVA_EXT_DIRS_PROPERTY_KEY);
        assertEquals("os.name", OS_NAME_PROPERTY_KEY);
        assertEquals("os.arch", OS_ARCH_PROPERTY_KEY);
        assertEquals("os.version", OS_VERSION_PROPERTY_KEY);
        assertEquals("file.separator", FILE_SEPARATOR_PROPERTY_KEY);
        assertEquals("path.separator", PATH_SEPARATOR_PROPERTY_KEY);
        assertEquals("line.separator", LINE_SEPARATOR_PROPERTY_KEY);
        assertEquals("user.name", USER_NAME_PROPERTY_KEY);
        assertEquals("user.home", USER_HOME_PROPERTY_KEY);
        assertEquals("user.dir", USER_DIR_PROPERTY_KEY);
        assertEquals("file.encoding", FILE_ENCODING_PROPERTY_KEY);
    }

    @Test
    public void testSystemProperties() {
        assertEquals(System.getProperty("java.version"), JAVA_VERSION);
        assertEquals(System.getProperty("java.vendor"), JAVA_VENDOR);
        assertEquals(System.getProperty("java.vendor.url"), JAVA_VENDOR_URL);
        assertEquals(System.getProperty("java.home"), JAVA_HOME);
        assertEquals(System.getProperty("java.vm.specification.version"), JAVA_VM_SPECIFICATION_VERSION);
        assertEquals(System.getProperty("java.vm.specification.vendor"), JAVA_VM_SPECIFICATION_VENDOR);
        assertEquals(System.getProperty("java.vm.specification.name"), JAVA_VM_SPECIFICATION_NAME);
        assertEquals(System.getProperty("java.vm.version"), JAVA_VM_VERSION);
        assertEquals(System.getProperty("java.vm.vendor"), JAVA_VM_VENDOR);
        assertEquals(System.getProperty("java.vm.name"), JAVA_VM_NAME);
        assertEquals(System.getProperty("java.specification.version"), JAVA_SPECIFICATION_VERSION);
        assertEquals(System.getProperty("java.specification.vendor"), JAVA_SPECIFICATION_VENDOR);
        assertEquals(System.getProperty("java.specification.name"), JAVA_SPECIFICATION_NAME);
        assertEquals(System.getProperty("java.class.version"), JAVA_CLASS_VERSION);
        assertEquals(System.getProperty("java.class.path"), JAVA_CLASS_PATH);
        assertEquals(System.getProperty("java.library.path"), JAVA_LIBRARY_PATH);
        assertEquals(System.getProperty("java.io.tmpdir"), JAVA_IO_TMPDIR);
        assertEquals(System.getProperty("java.compiler"), JAVA_COMPILER);
        assertEquals(System.getProperty("java.ext.dirs"), JAVA_EXT_DIRS);
        assertEquals(System.getProperty("os.name"), OS_NAME);
        assertEquals(System.getProperty("os.arch"), OS_ARCH);
        assertEquals(System.getProperty("os.version"), OS_VERSION);
        assertEquals(System.getProperty("file.separator"), FILE_SEPARATOR);
        assertEquals(System.getProperty("path.separator"), PATH_SEPARATOR);
        assertEquals(System.getProperty("line.separator"), LINE_SEPARATOR);
        assertEquals(System.getProperty("user.name"), USER_NAME);
        assertEquals(System.getProperty("user.home"), USER_HOME);
        assertEquals(System.getProperty("user.dir"), USER_DIR);
        assertEquals(System.getProperty("file.encoding"), FILE_ENCODING);
    }
}
