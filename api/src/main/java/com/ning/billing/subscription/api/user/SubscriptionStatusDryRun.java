/*
 * Copyright 2010-2013 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.subscription.api.user;

import java.util.UUID;

import com.ning.billing.catalog.api.BillingPeriod;
import com.ning.billing.catalog.api.PhaseType;

public interface SubscriptionStatusDryRun {

    public UUID getId();

    public String getProductName();

    public BillingPeriod getBillingPeriod();

    public String getPriceList();

    public PhaseType getPhaseType();

    public DryRunChangeReason getReason();

    public enum DryRunChangeReason {
        AO_INCLUDED_IN_NEW_PLAN,
        AO_NOT_AVAILABLE_IN_NEW_PLAN,
        AO_AVAILABLE_IN_NEW_PLAN
    }
}
