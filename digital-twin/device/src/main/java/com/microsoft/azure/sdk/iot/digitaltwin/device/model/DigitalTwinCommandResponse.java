// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package com.microsoft.azure.sdk.iot.digitaltwin.device.model;

import com.microsoft.azure.sdk.iot.digitaltwin.device.AbstractDigitalTwinComponent;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

/**
 * Structure filled by the device application after processing a command on its interface and returned to the Digital Twin SDK.
 */
@Builder
@Getter
public class DigitalTwinCommandResponse {
    /**
     * Status code to map back to the server.  Roughly maps to HTTP status codes.
     * To indicate that this command has been accepted but that the final response is pending, set this to {@link AbstractDigitalTwinComponent#STATUS_CODE_PENDING}.
     */
    @NonNull
    private final Integer status;
    /**
     * Response payload to send to server.
     */
    private final String payload;
}