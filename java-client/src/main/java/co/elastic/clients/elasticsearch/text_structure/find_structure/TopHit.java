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

package co.elastic.clients.elasticsearch.text_structure.find_structure;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
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

// typedef: text_structure.find_structure.TopHit
@JsonpDeserializable
public final class TopHit implements JsonpSerializable {
	private final long count;

	private final JsonData value;

	// ---------------------------------------------------------------------------------------------

	public TopHit(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * API name: {@code count}
	 */
	public long count() {
		return this.count;
	}

	/**
	 * API name: {@code value}
	 */
	public JsonData value() {
		return this.value;
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

		generator.writeKey("value");
		this.value.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TopHit}.
	 */
	public static class Builder implements ObjectBuilder<TopHit> {
		private Long count;

		private JsonData value;

		/**
		 * API name: {@code count}
		 */
		public Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code value}
		 */
		public Builder value(JsonData value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds a {@link TopHit}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TopHit build() {

			return new TopHit(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TopHit}
	 */
	public static final JsonpDeserializer<TopHit> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TopHit::setupTopHitDeserializer, Builder::build);

	protected static void setupTopHitDeserializer(DelegatingDeserializer<TopHit.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::value, JsonData._DESERIALIZER, "value");

	}

}
