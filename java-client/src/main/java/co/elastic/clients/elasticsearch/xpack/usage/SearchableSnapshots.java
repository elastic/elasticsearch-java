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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: xpack.usage.SearchableSnapshots

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.SearchableSnapshots">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchableSnapshots extends Base {
	private final int indicesCount;

	@Nullable
	private final Integer fullCopyIndicesCount;

	@Nullable
	private final Integer sharedCacheIndicesCount;

	// ---------------------------------------------------------------------------------------------

	private SearchableSnapshots(Builder builder) {
		super(builder);

		this.indicesCount = ApiTypeHelper.requireNonNull(builder.indicesCount, this, "indicesCount");
		this.fullCopyIndicesCount = builder.fullCopyIndicesCount;
		this.sharedCacheIndicesCount = builder.sharedCacheIndicesCount;

	}

	public static SearchableSnapshots of(Function<Builder, ObjectBuilder<SearchableSnapshots>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code indices_count}
	 */
	public final int indicesCount() {
		return this.indicesCount;
	}

	/**
	 * API name: {@code full_copy_indices_count}
	 */
	@Nullable
	public final Integer fullCopyIndicesCount() {
		return this.fullCopyIndicesCount;
	}

	/**
	 * API name: {@code shared_cache_indices_count}
	 */
	@Nullable
	public final Integer sharedCacheIndicesCount() {
		return this.sharedCacheIndicesCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("indices_count");
		generator.write(this.indicesCount);

		if (this.fullCopyIndicesCount != null) {
			generator.writeKey("full_copy_indices_count");
			generator.write(this.fullCopyIndicesCount);

		}
		if (this.sharedCacheIndicesCount != null) {
			generator.writeKey("shared_cache_indices_count");
			generator.write(this.sharedCacheIndicesCount);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchableSnapshots}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<SearchableSnapshots> {
		private Integer indicesCount;

		@Nullable
		private Integer fullCopyIndicesCount;

		@Nullable
		private Integer sharedCacheIndicesCount;

		/**
		 * Required - API name: {@code indices_count}
		 */
		public final Builder indicesCount(int value) {
			this.indicesCount = value;
			return this;
		}

		/**
		 * API name: {@code full_copy_indices_count}
		 */
		public final Builder fullCopyIndicesCount(@Nullable Integer value) {
			this.fullCopyIndicesCount = value;
			return this;
		}

		/**
		 * API name: {@code shared_cache_indices_count}
		 */
		public final Builder sharedCacheIndicesCount(@Nullable Integer value) {
			this.sharedCacheIndicesCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchableSnapshots}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchableSnapshots build() {
			_checkSingleUse();

			return new SearchableSnapshots(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchableSnapshots}
	 */
	public static final JsonpDeserializer<SearchableSnapshots> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SearchableSnapshots::setupSearchableSnapshotsDeserializer);

	protected static void setupSearchableSnapshotsDeserializer(ObjectDeserializer<SearchableSnapshots.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::indicesCount, JsonpDeserializer.integerDeserializer(), "indices_count");
		op.add(Builder::fullCopyIndicesCount, JsonpDeserializer.integerDeserializer(), "full_copy_indices_count");
		op.add(Builder::sharedCacheIndicesCount, JsonpDeserializer.integerDeserializer(), "shared_cache_indices_count");

	}

}
