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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: transform._types.TimeSync
public final class TimeSync implements Sync, JsonpSerializable {
	@Nullable
	private final JsonValue delay;

	private final String field;

	// ---------------------------------------------------------------------------------------------

	public TimeSync(Builder builder) {

		this.delay = builder.delay;
		this.field = Objects.requireNonNull(builder.field, "field");

	}

	/**
	 * {@link Sync} variant type
	 */
	@Override
	public String _type() {
		return "time";
	}

	/**
	 * The time delay between the current time and the latest input data time.
	 * <p>
	 * API name: {@code delay}
	 */
	@Nullable
	public JsonValue delay() {
		return this.delay;
	}

	/**
	 * The date field that is used to identify new documents in the source.
	 * <p>
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
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
		generator.writeStartObject(_type());

		if (this.delay != null) {

			generator.writeKey("delay");
			generator.write(this.delay);

		}

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TimeSync}.
	 */
	public static class Builder implements ObjectBuilder<TimeSync> {
		@Nullable
		private JsonValue delay;

		private String field;

		/**
		 * The time delay between the current time and the latest input data time.
		 * <p>
		 * API name: {@code delay}
		 */
		public Builder delay(@Nullable JsonValue value) {
			this.delay = value;
			return this;
		}

		/**
		 * The date field that is used to identify new documents in the source.
		 * <p>
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Builds a {@link TimeSync}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TimeSync build() {

			return new TimeSync(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<TimeSync.Builder, TimeSync.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(TimeSync::setupTimeSyncDeserializer);

	protected static void setupTimeSyncDeserializer(DelegatingDeserializer<TimeSync.Builder> op) {

		op.add(Builder::delay, JsonpDeserializer.jsonValueDeserializer(), "delay");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");

	}

}
