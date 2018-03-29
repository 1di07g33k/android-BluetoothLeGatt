/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    private static final String UUID_MILI_SERVICE = "0000fee0-0000-1000-8000-00805f9b34fb";
    private static final String UUID_CHAR_pair = "0000ff0f-0000-1000-8000-00805f9b34fb";
    private static final String UUID_CHAR_CONTROL_POINT = "0000ff05-0000-1000-8000-00805f9b34fb";
    private static final String UUID_CHAR_REALTIME_STEPS = "0000ff06-0000-1000-8000-00805f9b34fb";
    private static final String UUID_CHAR_ACTIVITY = "0000ff07-0000-1000-8000-00805f9b34fb";
    private static final String UUID_CHAR_LE_PARAMS = "0000ff09-0000-1000-8000-00805f9b34fb";
    private static final String UUID_CHAR_DEVICE_NAME ="0000ff02-0000-1000-8000-00805f9b34fb";
    private static final String UUID_CHAR_BATTERY = "0000ff0c-0000-1000-8000-00805f9b34fb";

    static {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put(UUID_MILI_SERVICE,"UUID MILI Service");
        attributes.put(UUID_CHAR_pair,"UUID Char Pair");
        attributes.put(UUID_CHAR_CONTROL_POINT,"UUID Char Control Point");
        attributes.put(UUID_CHAR_REALTIME_STEPS,"UUID Char Realtime Steps");
        attributes.put(UUID_CHAR_ACTIVITY,"UUID Char Activity");
        attributes.put(UUID_CHAR_LE_PARAMS,"UUID Char LE Params");
        attributes.put(UUID_CHAR_DEVICE_NAME,"UUID Char Device Name");
        attributes.put(UUID_CHAR_BATTERY,"UUID Char Battery");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
