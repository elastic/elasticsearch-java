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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.MlCounter
@JsonpDeserializable
public final class MlCounter implements JsonpSerializable {
	private final Long count;

	// ---------------------------------------------------------------------------------------------

	public MlCounter(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");

	}

	/**
	 * API name: {@code count}
	 */
	public Long count() {
		return this.count;
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

		generator.writeKey("count");
		generator.write(this.count);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlCounter}.
	 */
	public static class Builder implements ObjectBuilder<MlCounter> {
		private Long count;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Long value) {
			this.count = value;
			return this;
		}

		/**
		 * Builds a {@link MlCounter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlCounter build() {

			return new MlCounter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlCounter}
	 */
	public static final JsonpDeserializer<MlCounter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MlCounter::setupMlCounterDeserializer, Builder::build);

	protected static void setupMlCounterDeserializer(DelegatingDeserializer<MlCounter.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");

	}

}
