/*
 * Copyright 2010-2012 Ning, Inc.
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

package com.ning.billing.util.audit.api;

import java.util.List;

import com.ning.billing.util.audit.AuditLog;
import com.ning.billing.util.audit.AuditLogsForAccount;

public class DefaultAuditLogsForAccount implements AuditLogsForAccount {

    private final List<AuditLog> auditLogsForAccount;

    public DefaultAuditLogsForAccount(final List<AuditLog> auditLogsForAccount) {
        this.auditLogsForAccount = auditLogsForAccount;
    }

    @Override
    public List<AuditLog> getAccountAuditLogs() {
        return auditLogsForAccount;
    }
}
