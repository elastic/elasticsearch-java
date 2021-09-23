/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security._types.CreatedStatus
public final class CreatedStatus implements JsonpSerializable {
	private final Boolean created;

	// ---------------------------------------------------------------------------------------------

	public CreatedStatus(Builder builder) {

		this.created = Objects.requireNonNull(builder.created, "created");

	}

	/**
	 * API name: {@code created}
	 */
	public Boolean created() {
		return this.created;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("created");
		generator.write(this.created);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreatedStatus}.
	 */
	public static class Builder implements ObjectBuilder<CreatedStatus> {
		private Boolean created;

		/**
		 * API name: {@code created}
		 */
		public Builder created(Boolean value) {
			this.created = value;
			return this;
		}

		/**
		 * Builds a {@link CreatedStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreatedStatus build() {

			return new CreatedStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CreatedStatus}
	 */
	public static final JsonpDeserializer<CreatedStatus> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CreatedStatus::setupCreatedStatusDeserializer);

	protected static void setupCreatedStatusDeserializer(DelegatingDeserializer<CreatedStatus.Builder> op) {

		op.add(Builder::created, JsonpDeserializer.booleanDeserializer(), "created");

	}

}
