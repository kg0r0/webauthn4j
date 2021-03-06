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

package com.webauthn4j.test.authenticator.webauthn;

import com.webauthn4j.test.client.AuthenticationEmulationOption;
import com.webauthn4j.test.client.RegistrationEmulationOption;

public interface WebAuthnAuthenticator {

    MakeCredentialResponse makeCredential(MakeCredentialRequest makeCredentialRequest, RegistrationEmulationOption registrationEmulationOption);

    GetAssertionResponse getAssertion(GetAssertionRequest getAssertionRequest, AuthenticationEmulationOption authenticationEmulationOption);

    boolean isCapableOfUserVerification();

    boolean isCapableOfStoringClientSideResidentCredential();

    boolean isCountUpEnabled();


}