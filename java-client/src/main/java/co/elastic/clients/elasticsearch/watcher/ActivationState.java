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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ActivationState
@JsonpDeserializable
public class ActivationState implements JsonpSerializable {
	private final boolean active;

	private final String timestamp;

	// ---------------------------------------------------------------------------------------------

	private ActivationState(Builder builder) {

		this.active = ModelTypeHelper.requireNonNull(builder.active, this, "active");
		this.timestamp = ModelTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");

	}

	public static ActivationState of(Function<Builder, ObjectBuilder<ActivationState>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code active}
	 */
	public final boolean active() {
		return this.active;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final String timestamp() {
		return this.timestamp;
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

		generator.writeKey("active");
		generator.write(this.active);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ActivationState}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ActivationState> {
		private Boolean active;

		private String timestamp;

		/**
		 * Required - API name: {@code active}
		 */
		public final Builder active(boolean value) {
			this.active = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Builds a {@link ActivationState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ActivationState build() {
			_checkSingleUse();

			return new ActivationState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ActivationState}
	 */
	public static final JsonpDeserializer<ActivationState> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ActivationState::setupActivationStateDeserializer, Builder::build);

	protected static void setupActivationStateDeserializer(DelegatingDeserializer<ActivationState.Builder> op) {

		op.add(Builder::active, JsonpDeserializer.booleanDeserializer(), "active");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");

	}

}
