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
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Scripting

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Scripting">API
 *      specification</a>
 */
@JsonpDeserializable
public class Scripting implements JsonpSerializable {
	@Nullable
	private final Long cacheEvictions;

	@Nullable
	private final Long compilations;

	private final Map<String, Long> compilationsHistory;

	@Nullable
	private final Long compilationLimitTriggered;

	private final List<Context> contexts;

	// ---------------------------------------------------------------------------------------------

	private Scripting(Builder builder) {

		this.cacheEvictions = builder.cacheEvictions;
		this.compilations = builder.compilations;
		this.compilationsHistory = ApiTypeHelper.unmodifiable(builder.compilationsHistory);
		this.compilationLimitTriggered = builder.compilationLimitTriggered;
		this.contexts = ApiTypeHelper.unmodifiable(builder.contexts);

	}

	public static Scripting of(Function<Builder, ObjectBuilder<Scripting>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code cache_evictions}
	 */
	@Nullable
	public final Long cacheEvictions() {
		return this.cacheEvictions;
	}

	/**
	 * API name: {@code compilations}
	 */
	@Nullable
	public final Long compilations() {
		return this.compilations;
	}

	/**
	 * API name: {@code compilations_history}
	 */
	public final Map<String, Long> compilationsHistory() {
		return this.compilationsHistory;
	}

	/**
	 * API name: {@code compilation_limit_triggered}
	 */
	@Nullable
	public final Long compilationLimitTriggered() {
		return this.compilationLimitTriggered;
	}

	/**
	 * API name: {@code contexts}
	 */
	public final List<Context> contexts() {
		return this.contexts;
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

		if (this.cacheEvictions != null) {
			generator.writeKey("cache_evictions");
			generator.write(this.cacheEvictions);

		}
		if (this.compilations != null) {
			generator.writeKey("compilations");
			generator.write(this.compilations);

		}
		if (ApiTypeHelper.isDefined(this.compilationsHistory)) {
			generator.writeKey("compilations_history");
			generator.writeStartObject();
			for (Map.Entry<String, Long> item0 : this.compilationsHistory.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.compilationLimitTriggered != null) {
			generator.writeKey("compilation_limit_triggered");
			generator.write(this.compilationLimitTriggered);

		}
		if (ApiTypeHelper.isDefined(this.contexts)) {
			generator.writeKey("contexts");
			generator.writeStartArray();
			for (Context item0 : this.contexts) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Scripting}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Scripting> {
		@Nullable
		private Long cacheEvictions;

		@Nullable
		private Long compilations;

		@Nullable
		private Map<String, Long> compilationsHistory;

		@Nullable
		private Long compilationLimitTriggered;

		@Nullable
		private List<Context> contexts;

		/**
		 * API name: {@code cache_evictions}
		 */
		public final Builder cacheEvictions(@Nullable Long value) {
			this.cacheEvictions = value;
			return this;
		}

		/**
		 * API name: {@code compilations}
		 */
		public final Builder compilations(@Nullable Long value) {
			this.compilations = value;
			return this;
		}

		/**
		 * API name: {@code compilations_history}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>compilationsHistory</code>.
		 */
		public final Builder compilationsHistory(Map<String, Long> map) {
			this.compilationsHistory = _mapPutAll(this.compilationsHistory, map);
			return this;
		}

		/**
		 * API name: {@code compilations_history}
		 * <p>
		 * Adds an entry to <code>compilationsHistory</code>.
		 */
		public final Builder compilationsHistory(String key, Long value) {
			this.compilationsHistory = _mapPut(this.compilationsHistory, key, value);
			return this;
		}

		/**
		 * API name: {@code compilation_limit_triggered}
		 */
		public final Builder compilationLimitTriggered(@Nullable Long value) {
			this.compilationLimitTriggered = value;
			return this;
		}

		/**
		 * API name: {@code contexts}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>contexts</code>.
		 */
		public final Builder contexts(List<Context> list) {
			this.contexts = _listAddAll(this.contexts, list);
			return this;
		}

		/**
		 * API name: {@code contexts}
		 * <p>
		 * Adds one or more values to <code>contexts</code>.
		 */
		public final Builder contexts(Context value, Context... values) {
			this.contexts = _listAdd(this.contexts, value, values);
			return this;
		}

		/**
		 * API name: {@code contexts}
		 * <p>
		 * Adds a value to <code>contexts</code> using a builder lambda.
		 */
		public final Builder contexts(Function<Context.Builder, ObjectBuilder<Context>> fn) {
			return contexts(fn.apply(new Context.Builder()).build());
		}

		@Override
		protected Builder self() {
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
		op.add(Builder::compilationsHistory,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer()), "compilations_history");
		op.add(Builder::compilationLimitTriggered, JsonpDeserializer.longDeserializer(), "compilation_limit_triggered");
		op.add(Builder::contexts, JsonpDeserializer.arrayDeserializer(Context._DESERIALIZER), "contexts");

	}

}
