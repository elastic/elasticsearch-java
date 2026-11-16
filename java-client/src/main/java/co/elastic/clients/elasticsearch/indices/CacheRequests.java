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

package co.elastic.clients.elasticsearch.indices;

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
import java.lang.Boolean;
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

// typedef: indices._types.CacheRequests

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.CacheRequests">API
 *      specification</a>
 */
@JsonpDeserializable
public class CacheRequests implements JsonpSerializable {
	@Nullable
	private final Boolean enable;

	// ---------------------------------------------------------------------------------------------

	private CacheRequests(Builder builder) {

		this.enable = builder.enable;

	}

	public static CacheRequests of(Function<Builder, ObjectBuilder<CacheRequests>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Whether the shard request cache is enabled for the index. This setting is
	 * dynamic and can be updated on an existing index.
	 * <p>
	 * API name: {@code enable}
	 */
	@Nullable
	public final Boolean enable() {
		return this.enable;
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

		if (this.enable != null) {
			generator.writeKey("enable");
			generator.write(this.enable);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CacheRequests}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CacheRequests> {
		@Nullable
		private Boolean enable;

		public Builder() {
		}
		private Builder(CacheRequests instance) {
			this.enable = instance.enable;

		}
		/**
		 * Whether the shard request cache is enabled for the index. This setting is
		 * dynamic and can be updated on an existing index.
		 * <p>
		 * API name: {@code enable}
		 */
		public final Builder enable(@Nullable Boolean value) {
			this.enable = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CacheRequests}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CacheRequests build() {
			_checkSingleUse();

			return new CacheRequests(this);
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
	 * Json deserializer for {@link CacheRequests}
	 */
	public static final JsonpDeserializer<CacheRequests> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CacheRequests::setupCacheRequestsDeserializer);

	protected static void setupCacheRequestsDeserializer(ObjectDeserializer<CacheRequests.Builder> op) {

		op.add(Builder::enable, JsonpDeserializer.booleanDeserializer(), "enable");

	}

}
