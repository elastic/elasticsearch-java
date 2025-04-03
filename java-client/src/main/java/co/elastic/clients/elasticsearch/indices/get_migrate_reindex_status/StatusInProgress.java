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

package co.elastic.clients.elasticsearch.indices.get_migrate_reindex_status;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
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

// typedef: indices.get_migrate_reindex_status.StatusInProgress

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.get_migrate_reindex_status.StatusInProgress">API
 *      specification</a>
 */
@JsonpDeserializable
public class StatusInProgress implements JsonpSerializable {
	private final String index;

	private final long totalDocCount;

	private final long reindexedDocCount;

	// ---------------------------------------------------------------------------------------------

	private StatusInProgress(Builder builder) {

		this.index = ApiTypeHelper.requireNonNullWithDefault(builder.index, this, "index", this.index());
		this.totalDocCount = ApiTypeHelper.requireNonNullWithDefault(builder.totalDocCount, this, "totalDocCount",
				this.totalDocCount());
		this.reindexedDocCount = ApiTypeHelper.requireNonNullWithDefault(builder.reindexedDocCount, this,
				"reindexedDocCount", this.reindexedDocCount());

	}

	public static StatusInProgress of(Function<Builder, ObjectBuilder<StatusInProgress>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code total_doc_count}
	 */
	public final long totalDocCount() {
		return this.totalDocCount;
	}

	/**
	 * Required - API name: {@code reindexed_doc_count}
	 */
	public final long reindexedDocCount() {
		return this.reindexedDocCount;
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

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("total_doc_count");
		generator.write(this.totalDocCount);

		generator.writeKey("reindexed_doc_count");
		generator.write(this.reindexedDocCount);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatusInProgress}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<StatusInProgress> {
		private String index;

		private Long totalDocCount;

		private Long reindexedDocCount;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_doc_count}
		 */
		public final Builder totalDocCount(long value) {
			this.totalDocCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code reindexed_doc_count}
		 */
		public final Builder reindexedDocCount(long value) {
			this.reindexedDocCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StatusInProgress}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StatusInProgress build() {
			_checkSingleUse();

			return new StatusInProgress(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StatusInProgress}
	 */
	public static final JsonpDeserializer<StatusInProgress> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StatusInProgress::setupStatusInProgressDeserializer);

	protected static void setupStatusInProgressDeserializer(ObjectDeserializer<StatusInProgress.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::totalDocCount, JsonpDeserializer.longDeserializer(), "total_doc_count");
		op.add(Builder::reindexedDocCount, JsonpDeserializer.longDeserializer(), "reindexed_doc_count");

	}

}
