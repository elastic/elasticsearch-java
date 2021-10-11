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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.open_point_in_time.Response
@JsonpDeserializable
public final class OpenPointInTimeResponse implements JsonpSerializable {
	private final String id;

	// ---------------------------------------------------------------------------------------------

	public OpenPointInTimeResponse(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");

	}

	public OpenPointInTimeResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code id}
	 */
	public String id() {
		return this.id;
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

		generator.writeKey("id");
		generator.write(this.id);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OpenPointInTimeResponse}.
	 */
	public static class Builder implements ObjectBuilder<OpenPointInTimeResponse> {
		private String id;

		/**
		 * Required - API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Builds a {@link OpenPointInTimeResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OpenPointInTimeResponse build() {

			return new OpenPointInTimeResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OpenPointInTimeResponse}
	 */
	public static final JsonpDeserializer<OpenPointInTimeResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OpenPointInTimeResponse::setupOpenPointInTimeResponseDeserializer, Builder::build);

	protected static void setupOpenPointInTimeResponseDeserializer(
			DelegatingDeserializer<OpenPointInTimeResponse.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");

	}

}
