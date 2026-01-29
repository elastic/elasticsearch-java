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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.elasticsearch._types.TokenPruningConfig;
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

// typedef: _types.mapping.SparseVectorIndexOptions

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.SparseVectorIndexOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class SparseVectorIndexOptions implements JsonpSerializable {
	@Nullable
	private final Boolean prune;

	@Nullable
	private final TokenPruningConfig pruningConfig;

	// ---------------------------------------------------------------------------------------------

	private SparseVectorIndexOptions(Builder builder) {

		this.prune = builder.prune;
		this.pruningConfig = builder.pruningConfig;

	}

	public static SparseVectorIndexOptions of(Function<Builder, ObjectBuilder<SparseVectorIndexOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Whether to perform pruning, omitting the non-significant tokens from the
	 * query to improve query performance. If prune is true but the pruning_config
	 * is not specified, pruning will occur but default values will be used.
	 * Default: false
	 * <p>
	 * API name: {@code prune}
	 */
	@Nullable
	public final Boolean prune() {
		return this.prune;
	}

	/**
	 * Optional pruning configuration. If enabled, this will omit non-significant
	 * tokens from the query in order to improve query performance. This is only
	 * used if prune is set to true. If prune is set to true but pruning_config is
	 * not specified, default values will be used.
	 * <p>
	 * API name: {@code pruning_config}
	 */
	@Nullable
	public final TokenPruningConfig pruningConfig() {
		return this.pruningConfig;
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

		if (this.prune != null) {
			generator.writeKey("prune");
			generator.write(this.prune);

		}
		if (this.pruningConfig != null) {
			generator.writeKey("pruning_config");
			this.pruningConfig.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SparseVectorIndexOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SparseVectorIndexOptions> {
		@Nullable
		private Boolean prune;

		@Nullable
		private TokenPruningConfig pruningConfig;

		public Builder() {
		}
		private Builder(SparseVectorIndexOptions instance) {
			this.prune = instance.prune;
			this.pruningConfig = instance.pruningConfig;

		}
		/**
		 * Whether to perform pruning, omitting the non-significant tokens from the
		 * query to improve query performance. If prune is true but the pruning_config
		 * is not specified, pruning will occur but default values will be used.
		 * Default: false
		 * <p>
		 * API name: {@code prune}
		 */
		public final Builder prune(@Nullable Boolean value) {
			this.prune = value;
			return this;
		}

		/**
		 * Optional pruning configuration. If enabled, this will omit non-significant
		 * tokens from the query in order to improve query performance. This is only
		 * used if prune is set to true. If prune is set to true but pruning_config is
		 * not specified, default values will be used.
		 * <p>
		 * API name: {@code pruning_config}
		 */
		public final Builder pruningConfig(@Nullable TokenPruningConfig value) {
			this.pruningConfig = value;
			return this;
		}

		/**
		 * Optional pruning configuration. If enabled, this will omit non-significant
		 * tokens from the query in order to improve query performance. This is only
		 * used if prune is set to true. If prune is set to true but pruning_config is
		 * not specified, default values will be used.
		 * <p>
		 * API name: {@code pruning_config}
		 */
		public final Builder pruningConfig(Function<TokenPruningConfig.Builder, ObjectBuilder<TokenPruningConfig>> fn) {
			return this.pruningConfig(fn.apply(new TokenPruningConfig.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SparseVectorIndexOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SparseVectorIndexOptions build() {
			_checkSingleUse();

			return new SparseVectorIndexOptions(this);
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
	 * Json deserializer for {@link SparseVectorIndexOptions}
	 */
	public static final JsonpDeserializer<SparseVectorIndexOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SparseVectorIndexOptions::setupSparseVectorIndexOptionsDeserializer);

	protected static void setupSparseVectorIndexOptionsDeserializer(
			ObjectDeserializer<SparseVectorIndexOptions.Builder> op) {

		op.add(Builder::prune, JsonpDeserializer.booleanDeserializer(), "prune");
		op.add(Builder::pruningConfig, TokenPruningConfig._DESERIALIZER, "pruning_config");

	}

}
