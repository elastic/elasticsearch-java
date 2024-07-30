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

package co.elastic.clients.elasticsearch.connector;

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

// typedef: connector._types.SyncRulesFeature

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.SyncRulesFeature">API
 *      specification</a>
 */
@JsonpDeserializable
public class SyncRulesFeature implements JsonpSerializable {
	@Nullable
	private final FeatureEnabled advanced;

	@Nullable
	private final FeatureEnabled basic;

	// ---------------------------------------------------------------------------------------------

	private SyncRulesFeature(Builder builder) {

		this.advanced = builder.advanced;
		this.basic = builder.basic;

	}

	public static SyncRulesFeature of(Function<Builder, ObjectBuilder<SyncRulesFeature>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code advanced}
	 */
	@Nullable
	public final FeatureEnabled advanced() {
		return this.advanced;
	}

	/**
	 * API name: {@code basic}
	 */
	@Nullable
	public final FeatureEnabled basic() {
		return this.basic;
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

		if (this.advanced != null) {
			generator.writeKey("advanced");
			this.advanced.serialize(generator, mapper);

		}
		if (this.basic != null) {
			generator.writeKey("basic");
			this.basic.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SyncRulesFeature}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SyncRulesFeature> {
		@Nullable
		private FeatureEnabled advanced;

		@Nullable
		private FeatureEnabled basic;

		/**
		 * API name: {@code advanced}
		 */
		public final Builder advanced(@Nullable FeatureEnabled value) {
			this.advanced = value;
			return this;
		}

		/**
		 * API name: {@code advanced}
		 */
		public final Builder advanced(Function<FeatureEnabled.Builder, ObjectBuilder<FeatureEnabled>> fn) {
			return this.advanced(fn.apply(new FeatureEnabled.Builder()).build());
		}

		/**
		 * API name: {@code basic}
		 */
		public final Builder basic(@Nullable FeatureEnabled value) {
			this.basic = value;
			return this;
		}

		/**
		 * API name: {@code basic}
		 */
		public final Builder basic(Function<FeatureEnabled.Builder, ObjectBuilder<FeatureEnabled>> fn) {
			return this.basic(fn.apply(new FeatureEnabled.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SyncRulesFeature}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SyncRulesFeature build() {
			_checkSingleUse();

			return new SyncRulesFeature(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SyncRulesFeature}
	 */
	public static final JsonpDeserializer<SyncRulesFeature> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SyncRulesFeature::setupSyncRulesFeatureDeserializer);

	protected static void setupSyncRulesFeatureDeserializer(ObjectDeserializer<SyncRulesFeature.Builder> op) {

		op.add(Builder::advanced, FeatureEnabled._DESERIALIZER, "advanced");
		op.add(Builder::basic, FeatureEnabled._DESERIALIZER, "basic");

	}

}
