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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: nodes._types.Scripting

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/nodes/_types/Stats.ts#L207-L210">API
 *      specification</a>
 */
@JsonpDeserializable
public class Scripting implements JsonpSerializable {
	private final long cacheEvictions;

	private final long compilations;

	// ---------------------------------------------------------------------------------------------

	private Scripting(Builder builder) {

		this.cacheEvictions = ApiTypeHelper.requireNonNull(builder.cacheEvictions, this, "cacheEvictions");
		this.compilations = ApiTypeHelper.requireNonNull(builder.compilations, this, "compilations");

	}

	public static Scripting of(Function<Builder, ObjectBuilder<Scripting>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code cache_evictions}
	 */
	public final long cacheEvictions() {
		return this.cacheEvictions;
	}

	/**
	 * Required - API name: {@code compilations}
	 */
	public final long compilations() {
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
		generator.write(this.cacheEvictions);

		generator.writeKey("compilations");
		generator.write(this.compilations);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Scripting}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Scripting> {
		private Long cacheEvictions;

		private Long compilations;

		/**
		 * Required - API name: {@code cache_evictions}
		 */
		public final Builder cacheEvictions(long value) {
			this.cacheEvictions = value;
			return this;
		}

		/**
		 * Required - API name: {@code compilations}
		 */
		public final Builder compilations(long value) {
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
			_checkSingleUse();

			return new Scripting(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Scripting}
	 */
	public static final JsonpDeserializer<Scripting> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Scripting::setupScriptingDeserializer);

	protected static void setupScriptingDeserializer(ObjectDeserializer<Scripting.Builder> op) {

		op.add(Builder::cacheEvictions, JsonpDeserializer.longDeserializer(), "cache_evictions");
		op.add(Builder::compilations, JsonpDeserializer.longDeserializer(), "compilations");

	}

}
