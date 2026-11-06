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

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: inference._types.CacheControl

/**
 * The prompt caching configuration to use for the completion request. Currently
 * supported only for <code>elastic</code> provider.
 * 
 * @see <a href="../doc-files/api-spec.html#inference._types.CacheControl">API
 *      specification</a>
 */
@JsonpDeserializable
public class CacheControl implements JsonpSerializable {
	@Nullable
	private final String type;

	@Nullable
	private final Time ttl;

	// ---------------------------------------------------------------------------------------------

	private CacheControl(Builder builder) {

		this.type = builder.type;
		this.ttl = builder.ttl;

	}

	public static CacheControl of(Function<Builder, ObjectBuilder<CacheControl>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The type of cache control, for example <code>ephemeral</code>.
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public final String type() {
		return this.type;
	}

	/**
	 * The time to live of the cached content, for example <code>1h</code>.
	 * <p>
	 * API name: {@code ttl}
	 */
	@Nullable
	public final Time ttl() {
		return this.ttl;
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

		if (this.type != null) {
			generator.writeKey("type");
			generator.write(this.type);

		}
		if (this.ttl != null) {
			generator.writeKey("ttl");
			this.ttl.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CacheControl}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CacheControl> {
		@Nullable
		private String type;

		@Nullable
		private Time ttl;

		public Builder() {
		}
		private Builder(CacheControl instance) {
			this.type = instance.type;
			this.ttl = instance.ttl;

		}
		/**
		 * The type of cache control, for example <code>ephemeral</code>.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * The time to live of the cached content, for example <code>1h</code>.
		 * <p>
		 * API name: {@code ttl}
		 */
		public final Builder ttl(@Nullable Time value) {
			this.ttl = value;
			return this;
		}

		/**
		 * The time to live of the cached content, for example <code>1h</code>.
		 * <p>
		 * API name: {@code ttl}
		 */
		public final Builder ttl(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.ttl(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CacheControl}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CacheControl build() {
			_checkSingleUse();

			return new CacheControl(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CacheControl}
	 */
	public static final JsonpDeserializer<CacheControl> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CacheControl::setupCacheControlDeserializer);

	protected static void setupCacheControlDeserializer(ObjectDeserializer<CacheControl.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::ttl, Time._DESERIALIZER, "ttl");

	}

}
