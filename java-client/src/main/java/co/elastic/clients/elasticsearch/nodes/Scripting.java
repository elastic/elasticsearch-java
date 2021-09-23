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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes._types.Scripting
public final class Scripting implements JsonpSerializable {
	private final Number cacheEvictions;

	private final Number compilations;

	// ---------------------------------------------------------------------------------------------

	public Scripting(Builder builder) {

		this.cacheEvictions = Objects.requireNonNull(builder.cacheEvictions, "cache_evictions");
		this.compilations = Objects.requireNonNull(builder.compilations, "compilations");

	}

	/**
	 * API name: {@code cache_evictions}
	 */
	public Number cacheEvictions() {
		return this.cacheEvictions;
	}

	/**
	 * API name: {@code compilations}
	 */
	public Number compilations() {
		return this.compilations;
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

		generator.writeKey("cache_evictions");
		generator.write(this.cacheEvictions.doubleValue());

		generator.writeKey("compilations");
		generator.write(this.compilations.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Scripting}.
	 */
	public static class Builder implements ObjectBuilder<Scripting> {
		private Number cacheEvictions;

		private Number compilations;

		/**
		 * API name: {@code cache_evictions}
		 */
		public Builder cacheEvictions(Number value) {
			this.cacheEvictions = value;
			return this;
		}

		/**
		 * API name: {@code compilations}
		 */
		public Builder compilations(Number value) {
			this.compilations = value;
			return this;
		}

		/**
		 * Builds a {@link Scripting}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Scripting build() {

			return new Scripting(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Scripting}
	 */
	public static final JsonpDeserializer<Scripting> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Scripting::setupScriptingDeserializer);

	protected static void setupScriptingDeserializer(DelegatingDeserializer<Scripting.Builder> op) {

		op.add(Builder::cacheEvictions, JsonpDeserializer.numberDeserializer(), "cache_evictions");
		op.add(Builder::compilations, JsonpDeserializer.numberDeserializer(), "compilations");

	}

}
