/*
 *
 *  Copyright (c) 2019, Wasiq Bhamla.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package com.github.wasiqb.coteafs.appium.device;

import com.github.wasiqb.coteafs.selenium.core.base.driver.DriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * @author Wasiq Bhamla
 * @since 25-Dec-2019
 */
public class DeviceSession extends DriverSession<AppiumDriver<MobileElement>> {
    /**
     * @param driver Device Driver
     * @author Wasiq Bhamla
     * @since 25-Dec-2019
     */
    public DeviceSession(final AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}