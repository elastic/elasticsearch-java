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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: rollup.start_job.Response
@JsonpDeserializable
public final class StartJobResponse implements JsonpSerializable {
	private final boolean started;

	// ---------------------------------------------------------------------------------------------

	public StartJobResponse(Builder builder) {

		this.started = Objects.requireNonNull(builder.started, "started");

	}

	public StartJobResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code started}
	 */
	public boolean started() {
		return this.started;
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

		generator.writeKey("started");
		generator.write(this.started);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StartJobResponse}.
	 */
	public static class Builder implements ObjectBuilder<StartJobResponse> {
		private Boolean started;

		/**
		 * Required - API name: {@code started}
		 */
		public Builder started(boolean value) {
			this.started = value;
			return this;
		}

		/**
		 * Builds a {@link StartJobResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StartJobResponse build() {

			return new StartJobResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StartJobResponse}
	 */
	public static final JsonpDeserializer<StartJobResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StartJobResponse::setupStartJobResponseDeserializer, Builder::build);

	protected static void setupStartJobResponseDeserializer(DelegatingDeserializer<StartJobResponse.Builder> op) {

		op.add(Builder::started, JsonpDeserializer.booleanDeserializer(), "started");

	}

}
