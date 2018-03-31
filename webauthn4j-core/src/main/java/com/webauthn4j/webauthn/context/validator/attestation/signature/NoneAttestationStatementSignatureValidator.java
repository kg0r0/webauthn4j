/*
 * Copyright 2002-2018 the original author or authors.
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

package com.webauthn4j.webauthn.context.validator.attestation.signature;

import com.webauthn4j.webauthn.attestation.statement.NoneAttestationStatement;
import com.webauthn4j.webauthn.context.WebAuthnRegistrationContext;

public class NoneAttestationStatementSignatureValidator implements AttestationStatementSignatureValidator {
    @Override
    public void validate(WebAuthnRegistrationContext registrationContext) {
        //nop //TODO
    }

    @Override
    public boolean supports(String format) {
        return NoneAttestationStatement.FORMAT.equals(format);
    }
}