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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
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

// typedef: _types.analysis.MinHashTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.MinHashTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class MinHashTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	@Nullable
	private final Integer bucketCount;

	@Nullable
	private final Integer hashCount;

	@Nullable
	private final Integer hashSetSize;

	@Nullable
	private final Boolean withRotation;

	// ---------------------------------------------------------------------------------------------

	private MinHashTokenFilter(Builder builder) {
		super(builder);

		this.bucketCount = builder.bucketCount;
		this.hashCount = builder.hashCount;
		this.hashSetSize = builder.hashSetSize;
		this.withRotation = builder.withRotation;

	}

	public static MinHashTokenFilter of(Function<Builder, ObjectBuilder<MinHashTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.MinHash;
	}

	/**
	 * Number of buckets to which hashes are assigned. Defaults to <code>512</code>.
	 * <p>
	 * API name: {@code bucket_count}
	 */
	@Nullable
	public final Integer bucketCount() {
		return this.bucketCount;
	}

	/**
	 * Number of ways to hash each token in the stream. Defaults to <code>1</code>.
	 * <p>
	 * API name: {@code hash_count}
	 */
	@Nullable
	public final Integer hashCount() {
		return this.hashCount;
	}

	/**
	 * Number of hashes to keep from each bucket. Defaults to <code>1</code>. Hashes
	 * are retained by ascending size, starting with the bucket’s smallest hash
	 * first.
	 * <p>
	 * API name: {@code hash_set_size}
	 */
	@Nullable
	public final Integer hashSetSize() {
		return this.hashSetSize;
	}

	/**
	 * If <code>true</code>, the filter fills empty buckets with the value of the
	 * first non-empty bucket to its circular right if the
	 * <code>hash_set_size</code> is <code>1</code>. If the
	 * <code>bucket_count</code> argument is greater than 1, this parameter defaults
	 * to <code>true</code>. Otherwise, this parameter defaults to
	 * <code>false</code>.
	 * <p>
	 * API name: {@code with_rotation}
	 */
	@Nullable
	public final Boolean withRotation() {
		return this.withRotation;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "min_hash");
		super.serializeInternal(generator, mapper);
		if (this.bucketCount != null) {
			generator.writeKey("bucket_count");
			generator.write(this.bucketCount);

		}
		if (this.hashCount != null) {
			generator.writeKey("hash_count");
			generator.write(this.hashCount);

		}
		if (this.hashSetSize != null) {
			generator.writeKey("hash_set_size");
			generator.write(this.hashSetSize);

		}
		if (this.withRotation != null) {
			generator.writeKey("with_rotation");
			generator.write(this.withRotation);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MinHashTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MinHashTokenFilter> {
		@Nullable
		private Integer bucketCount;

		@Nullable
		private Integer hashCount;

		@Nullable
		private Integer hashSetSize;

		@Nullable
		private Boolean withRotation;

		/**
		 * Number of buckets to which hashes are assigned. Defaults to <code>512</code>.
		 * <p>
		 * API name: {@code bucket_count}
		 */
		public final Builder bucketCount(@Nullable Integer value) {
			this.bucketCount = value;
			return this;
		}

		/**
		 * Number of ways to hash each token in the stream. Defaults to <code>1</code>.
		 * <p>
		 * API name: {@code hash_count}
		 */
		public final Builder hashCount(@Nullable Integer value) {
			this.hashCount = value;
			return this;
		}

		/**
		 * Number of hashes to keep from each bucket. Defaults to <code>1</code>. Hashes
		 * are retained by ascending size, starting with the bucket’s smallest hash
		 * first.
		 * <p>
		 * API name: {@code hash_set_size}
		 */
		public final Builder hashSetSize(@Nullable Integer value) {
			this.hashSetSize = value;
			return this;
		}

		/**
		 * If <code>true</code>, the filter fills empty buckets with the value of the
		 * first non-empty bucket to its circular right if the
		 * <code>hash_set_size</code> is <code>1</code>. If the
		 * <code>bucket_count</code> argument is greater than 1, this parameter defaults
		 * to <code>true</code>. Otherwise, this parameter defaults to
		 * <code>false</code>.
		 * <p>
		 * API name: {@code with_rotation}
		 */
		public final Builder withRotation(@Nullable Boolean value) {
			this.withRotation = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MinHashTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MinHashTokenFilter build() {
			_checkSingleUse();

			return new MinHashTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MinHashTokenFilter}
	 */
	public static final JsonpDeserializer<MinHashTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MinHashTokenFilter::setupMinHashTokenFilterDeserializer);

	protected static void setupMinHashTokenFilterDeserializer(ObjectDeserializer<MinHashTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::bucketCount, JsonpDeserializer.integerDeserializer(), "bucket_count");
		op.add(Builder::hashCount, JsonpDeserializer.integerDeserializer(), "hash_count");
		op.add(Builder::hashSetSize, JsonpDeserializer.integerDeserializer(), "hash_set_size");
		op.add(Builder::withRotation, JsonpDeserializer.booleanDeserializer(), "with_rotation");

		op.ignore("type");
	}

}
