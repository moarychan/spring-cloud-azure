/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.spring.integration.servicebus.topic;

import com.microsoft.azure.management.servicebus.ServiceBusSubscription;
import com.microsoft.azure.spring.integration.core.SendOperation;
import com.microsoft.azure.spring.integration.core.SubscribeByGroupOperation;
import com.microsoft.azure.spring.integration.eventhub.inbound.CheckpointMode;

/**
 * Azure service bus topic operation to support send {@link org.springframework.messaging.Message} asynchronously
 * and subscribe by {@link ServiceBusSubscription} as consumer group
 *
 * @author Warren Zhu
 */
public interface ServiceBusTopicOperation extends SendOperation, SubscribeByGroupOperation {
    void setCheckpointMode(CheckpointMode checkpointMode);
}
