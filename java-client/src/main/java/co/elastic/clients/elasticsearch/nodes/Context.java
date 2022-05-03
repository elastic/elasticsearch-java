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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Context

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Context">API
 *      specification</a>
 */
@JsonpDeserializable
public class Context implements JsonpSerializable {
	@Nullable
	private final String context;

	@Nullable
	private final Long compilations;

	@Nullable
	private final Long cacheEvictions;

	@Nullable
	private final Long compilationLimitTriggered;

	// ---------------------------------------------------------------------------------------------

	private Context(Builder builder) {

		this.context = builder.context;
		this.compilations = builder.compilations;
		this.cacheEvictions = builder.cacheEvictions;
		this.compilationLimitTriggered = builder.compilationLimitTriggered;

	}

	public static Context of(Function<Builder, ObjectBuilder<Context>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code context}
	 */
	@Nullable
	public final String context() {
		return this.context;
	}

	/**
	 * API name: {@code compilations}
	 */
	@Nullable
	public final Long compilations() {
		return this.compilations;
	}

	/**
	 * API name: {@code cache_evictions}
	 */
	@Nullable
	public final Long cacheEvictions() {
		return this.cacheEvictions;
	}

	/**
	 * API name: {@code compilation_limit_triggered}
	 */
	@Nullable
	public final Long compilationLimitTriggered() {
		return this.compilationLimitTriggered;
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

		if (this.context != null) {
			generator.writeKey("context");
			generator.write(this.context);

		}
		if (this.compilations != null) {
			generator.writeKey("compilations");
			generator.write(this.compilations);

		}
		if (this.cacheEvictions != null) {
			generator.writeKey("cache_evictions");
			generator.write(this.cacheEvictions);

		}
		if (this.compilationLimitTriggered != null) {
			generator.writeKey("compilation_limit_triggered");
			generator.write(this.compilationLimitTriggered);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Context}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Context> {
		@Nullable
		private String context;

		@Nullable
		private Long compilations;

		@Nullable
		private Long cacheEvictions;

		@Nullable
		private Long compilationLimitTriggered;

		/**
		 * API name: {@code context}
		 */
		public final Builder context(@Nullable String value) {
			this.context = value;
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
		 * API name: {@code cache_evictions}
		 */
		public final Builder cacheEvictions(@Nullable Long value) {
			this.cacheEvictions = value;
			return this;
		}

		/**
		 * API name: {@code compilation_limit_triggered}
		 */
		public final Builder compilationLimitTriggered(@Nullable Long value) {
			this.compilationLimitTriggered = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Context}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Context build() {
			_checkSingleUse();

			return new Context(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Context}
	 */
	public static final JsonpDeserializer<Context> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Context::setupContextDeserializer);

	protected static void setupContextDeserializer(ObjectDeserializer<Context.Builder> op) {

		op.add(Builder::context, JsonpDeserializer.stringDeserializer(), "context");
		op.add(Builder::compilations, JsonpDeserializer.longDeserializer(), "compilations");
		op.add(Builder::cacheEvictions, JsonpDeserializer.longDeserializer(), "cache_evictions");
		op.add(Builder::compilationLimitTriggered, JsonpDeserializer.longDeserializer(), "compilation_limit_triggered");

	}

}
