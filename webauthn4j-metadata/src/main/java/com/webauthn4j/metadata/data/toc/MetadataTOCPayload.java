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

package com.webauthn4j.metadata.data.toc;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * Represents the MetadataTOCPayload
 */
public class MetadataTOCPayload implements Serializable {

    @JsonProperty
    private String legalHeader;

    @JsonProperty
    private Integer no;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonProperty
    private LocalDate nextUpdate;

    @JsonProperty
    private List<MetadataTOCPayloadEntry> entries;

    public MetadataTOCPayload(
            String legalHeader,
            Integer no,
            LocalDate nextUpdate,
            List<MetadataTOCPayloadEntry> entries) {
        this.legalHeader = legalHeader;
        this.no = no;
        this.nextUpdate = nextUpdate;
        this.entries = entries;
    }

    public MetadataTOCPayload() {
    }

    public String getLegalHeader() {
        return legalHeader;
    }

    public LocalDate getNextUpdate() {
        return nextUpdate;
    }

    public Integer getNo() {
        return no;
    }

    public List<MetadataTOCPayloadEntry> getEntries() {
        return entries;
    }

}