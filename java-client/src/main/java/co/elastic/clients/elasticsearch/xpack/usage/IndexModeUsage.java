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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: xpack.usage.IndexModeUsage

/**
 * Usage of the indices with a given <code>index.mode</code>.
 * 
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.IndexModeUsage">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexModeUsage extends Base {
	private final long indicesCount;

	private final long indicesWithSyntheticSource;

	private final long numDocs;

	private final long sizeInBytes;

	private final long dataStreamsCount;

	private final long dataStreamsManagedByIlm;

	private final long dataStreamsManagedByDlm;

	// ---------------------------------------------------------------------------------------------

	private IndexModeUsage(Builder builder) {
		super(builder);

		this.indicesCount = ApiTypeHelper.requireNonNull(builder.indicesCount, this, "indicesCount", 0);
		this.indicesWithSyntheticSource = ApiTypeHelper.requireNonNull(builder.indicesWithSyntheticSource, this,
				"indicesWithSyntheticSource", 0);
		this.numDocs = ApiTypeHelper.requireNonNull(builder.numDocs, this, "numDocs", 0);
		this.sizeInBytes = ApiTypeHelper.requireNonNull(builder.sizeInBytes, this, "sizeInBytes", 0);
		this.dataStreamsCount = ApiTypeHelper.requireNonNull(builder.dataStreamsCount, this, "dataStreamsCount", 0);
		this.dataStreamsManagedByIlm = ApiTypeHelper.requireNonNull(builder.dataStreamsManagedByIlm, this,
				"dataStreamsManagedByIlm", 0);
		this.dataStreamsManagedByDlm = ApiTypeHelper.requireNonNull(builder.dataStreamsManagedByDlm, this,
				"dataStreamsManagedByDlm", 0);

	}

	public static IndexModeUsage of(Function<Builder, ObjectBuilder<IndexModeUsage>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of indices in this index mode.
	 * <p>
	 * API name: {@code indices_count}
	 */
	public final long indicesCount() {
		return this.indicesCount;
	}

	/**
	 * Required - The number of indices in this index mode that use synthetic
	 * <code>_source</code>.
	 * <p>
	 * API name: {@code indices_with_synthetic_source}
	 */
	public final long indicesWithSyntheticSource() {
		return this.indicesWithSyntheticSource;
	}

	/**
	 * Required - The number of documents in the indices in this index mode.
	 * <p>
	 * API name: {@code num_docs}
	 */
	public final long numDocs() {
		return this.numDocs;
	}

	/**
	 * Required - The size of the indices in this index mode, in bytes.
	 * <p>
	 * API name: {@code size_in_bytes}
	 */
	public final long sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * Required - The number of data streams in this index mode.
	 * <p>
	 * API name: {@code data_streams_count}
	 */
	public final long dataStreamsCount() {
		return this.dataStreamsCount;
	}

	/**
	 * Required - The number of data streams in this index mode that are managed by
	 * index lifecycle management.
	 * <p>
	 * API name: {@code data_streams_managed_by_ilm}
	 */
	public final long dataStreamsManagedByIlm() {
		return this.dataStreamsManagedByIlm;
	}

	/**
	 * Required - The number of data streams in this index mode that are managed by
	 * data stream lifecycle.
	 * <p>
	 * API name: {@code data_streams_managed_by_dlm}
	 */
	public final long dataStreamsManagedByDlm() {
		return this.dataStreamsManagedByDlm;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("indices_count");
		generator.write(this.indicesCount);

		generator.writeKey("indices_with_synthetic_source");
		generator.write(this.indicesWithSyntheticSource);

		generator.writeKey("num_docs");
		generator.write(this.numDocs);

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes);

		generator.writeKey("data_streams_count");
		generator.write(this.dataStreamsCount);

		generator.writeKey("data_streams_managed_by_ilm");
		generator.write(this.dataStreamsManagedByIlm);

		generator.writeKey("data_streams_managed_by_dlm");
		generator.write(this.dataStreamsManagedByDlm);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexModeUsage}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<IndexModeUsage> {
		private Long indicesCount;

		private Long indicesWithSyntheticSource;

		private Long numDocs;

		private Long sizeInBytes;

		private Long dataStreamsCount;

		private Long dataStreamsManagedByIlm;

		private Long dataStreamsManagedByDlm;

		public Builder() {
		}
		private Builder(IndexModeUsage instance) {
			this.indicesCount = instance.indicesCount;
			this.indicesWithSyntheticSource = instance.indicesWithSyntheticSource;
			this.numDocs = instance.numDocs;
			this.sizeInBytes = instance.sizeInBytes;
			this.dataStreamsCount = instance.dataStreamsCount;
			this.dataStreamsManagedByIlm = instance.dataStreamsManagedByIlm;
			this.dataStreamsManagedByDlm = instance.dataStreamsManagedByDlm;

		}
		/**
		 * Required - The number of indices in this index mode.
		 * <p>
		 * API name: {@code indices_count}
		 */
		public final Builder indicesCount(long value) {
			this.indicesCount = value;
			return this;
		}

		/**
		 * Required - The number of indices in this index mode that use synthetic
		 * <code>_source</code>.
		 * <p>
		 * API name: {@code indices_with_synthetic_source}
		 */
		public final Builder indicesWithSyntheticSource(long value) {
			this.indicesWithSyntheticSource = value;
			return this;
		}

		/**
		 * Required - The number of documents in the indices in this index mode.
		 * <p>
		 * API name: {@code num_docs}
		 */
		public final Builder numDocs(long value) {
			this.numDocs = value;
			return this;
		}

		/**
		 * Required - The size of the indices in this index mode, in bytes.
		 * <p>
		 * API name: {@code size_in_bytes}
		 */
		public final Builder sizeInBytes(long value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * Required - The number of data streams in this index mode.
		 * <p>
		 * API name: {@code data_streams_count}
		 */
		public final Builder dataStreamsCount(long value) {
			this.dataStreamsCount = value;
			return this;
		}

		/**
		 * Required - The number of data streams in this index mode that are managed by
		 * index lifecycle management.
		 * <p>
		 * API name: {@code data_streams_managed_by_ilm}
		 */
		public final Builder dataStreamsManagedByIlm(long value) {
			this.dataStreamsManagedByIlm = value;
			return this;
		}

		/**
		 * Required - The number of data streams in this index mode that are managed by
		 * data stream lifecycle.
		 * <p>
		 * API name: {@code data_streams_managed_by_dlm}
		 */
		public final Builder dataStreamsManagedByDlm(long value) {
			this.dataStreamsManagedByDlm = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexModeUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexModeUsage build() {
			_checkSingleUse();

			return new IndexModeUsage(this);
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
	 * Json deserializer for {@link IndexModeUsage}
	 */
	public static final JsonpDeserializer<IndexModeUsage> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexModeUsage::setupIndexModeUsageDeserializer);

	protected static void setupIndexModeUsageDeserializer(ObjectDeserializer<IndexModeUsage.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::indicesCount, JsonpDeserializer.longDeserializer(), "indices_count");
		op.add(Builder::indicesWithSyntheticSource, JsonpDeserializer.longDeserializer(),
				"indices_with_synthetic_source");
		op.add(Builder::numDocs, JsonpDeserializer.longDeserializer(), "num_docs");
		op.add(Builder::sizeInBytes, JsonpDeserializer.longDeserializer(), "size_in_bytes");
		op.add(Builder::dataStreamsCount, JsonpDeserializer.longDeserializer(), "data_streams_count");
		op.add(Builder::dataStreamsManagedByIlm, JsonpDeserializer.longDeserializer(), "data_streams_managed_by_ilm");
		op.add(Builder::dataStreamsManagedByDlm, JsonpDeserializer.longDeserializer(), "data_streams_managed_by_dlm");

	}

}
