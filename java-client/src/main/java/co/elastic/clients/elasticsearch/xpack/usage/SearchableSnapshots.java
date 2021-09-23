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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.SearchableSnapshots
public final class SearchableSnapshots extends Base {
	private final Number indicesCount;

	@Nullable
	private final Number fullCopyIndicesCount;

	@Nullable
	private final Number sharedCacheIndicesCount;

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
	public Number indicesCount() {
		return this.indicesCount;
	}

	/**
	 * API name: {@code full_copy_indices_count}
	 */
	@Nullable
	public Number fullCopyIndicesCount() {
		return this.fullCopyIndicesCount;
	}

	/**
	 * API name: {@code shared_cache_indices_count}
	 */
	@Nullable
	public Number sharedCacheIndicesCount() {
		return this.sharedCacheIndicesCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("indices_count");
		generator.write(this.indicesCount.doubleValue());

		if (this.fullCopyIndicesCount != null) {

			generator.writeKey("full_copy_indices_count");
			generator.write(this.fullCopyIndicesCount.doubleValue());

		}
		if (this.sharedCacheIndicesCount != null) {

			generator.writeKey("shared_cache_indices_count");
			generator.write(this.sharedCacheIndicesCount.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchableSnapshots}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<SearchableSnapshots> {
		private Number indicesCount;

		@Nullable
		private Number fullCopyIndicesCount;

		@Nullable
		private Number sharedCacheIndicesCount;

		/**
		 * API name: {@code indices_count}
		 */
		public Builder indicesCount(Number value) {
			this.indicesCount = value;
			return this;
		}

		/**
		 * API name: {@code full_copy_indices_count}
		 */
		public Builder fullCopyIndicesCount(@Nullable Number value) {
			this.fullCopyIndicesCount = value;
			return this;
		}

		/**
		 * API name: {@code shared_cache_indices_count}
		 */
		public Builder sharedCacheIndicesCount(@Nullable Number value) {
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
	public static final JsonpDeserializer<SearchableSnapshots> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SearchableSnapshots::setupSearchableSnapshotsDeserializer);

	protected static void setupSearchableSnapshotsDeserializer(DelegatingDeserializer<SearchableSnapshots.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::indicesCount, JsonpDeserializer.numberDeserializer(), "indices_count");
		op.add(Builder::fullCopyIndicesCount, JsonpDeserializer.numberDeserializer(), "full_copy_indices_count");
		op.add(Builder::sharedCacheIndicesCount, JsonpDeserializer.numberDeserializer(), "shared_cache_indices_count");

	}

}
