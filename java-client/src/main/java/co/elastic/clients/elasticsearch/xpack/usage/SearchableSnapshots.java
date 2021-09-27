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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.SearchableSnapshots
@JsonpDeserializable
public final class SearchableSnapshots extends Base {
	private final Integer indicesCount;

	@Nullable
	private final Integer fullCopyIndicesCount;

	@Nullable
	private final Integer sharedCacheIndicesCount;

	// ---------------------------------------------------------------------------------------------

	public SearchableSnapshots(Builder builder) {
		super(builder);

		this.indicesCount = Objects.requireNonNull(builder.indicesCount, "indices_count");
		this.fullCopyIndicesCount = builder.fullCopyIndicesCount;
		this.sharedCacheIndicesCount = builder.sharedCacheIndicesCount;

	}

	/**
	 * API name: {@code indices_count}
	 */
	public Integer indicesCount() {
		return this.indicesCount;
	}

	/**
	 * API name: {@code full_copy_indices_count}
	 */
	@Nullable
	public Integer fullCopyIndicesCount() {
		return this.fullCopyIndicesCount;
	}

	/**
	 * API name: {@code shared_cache_indices_count}
	 */
	@Nullable
	public Integer sharedCacheIndicesCount() {
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
		 * API name: {@code indices_count}
		 */
		public Builder indicesCount(Integer value) {
			this.indicesCount = value;
			return this;
		}

		/**
		 * API name: {@code full_copy_indices_count}
		 */
		public Builder fullCopyIndicesCount(@Nullable Integer value) {
			this.fullCopyIndicesCount = value;
			return this;
		}

		/**
		 * API name: {@code shared_cache_indices_count}
		 */
		public Builder sharedCacheIndicesCount(@Nullable Integer value) {
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

			return new SearchableSnapshots(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchableSnapshots}
	 */
	public static final JsonpDeserializer<SearchableSnapshots> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SearchableSnapshots::setupSearchableSnapshotsDeserializer, Builder::build);

	protected static void setupSearchableSnapshotsDeserializer(DelegatingDeserializer<SearchableSnapshots.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::indicesCount, JsonpDeserializer.integerDeserializer(), "indices_count");
		op.add(Builder::fullCopyIndicesCount, JsonpDeserializer.integerDeserializer(), "full_copy_indices_count");
		op.add(Builder::sharedCacheIndicesCount, JsonpDeserializer.integerDeserializer(), "shared_cache_indices_count");

	}

}
