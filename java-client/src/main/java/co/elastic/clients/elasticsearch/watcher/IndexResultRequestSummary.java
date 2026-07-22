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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.json.JsonData;
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

// typedef: watcher._types.IndexResultRequestSummary

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.IndexResultRequestSummary">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexResultRequestSummary implements IndexResultVariant, JsonpSerializable {
	@Nullable
	private final String docId;

	private final String index;

	@Nullable
	private final Refresh refresh;

	private final JsonData source;

	// ---------------------------------------------------------------------------------------------

	private IndexResultRequestSummary(Builder builder) {

		this.docId = builder.docId;
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.refresh = builder.refresh;
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");

	}

	public static IndexResultRequestSummary of(Function<Builder, ObjectBuilder<IndexResultRequestSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * IndexResult variant kind.
	 */
	@Override
	public IndexResult.Kind _indexResultKind() {
		return IndexResult.Kind.Request;
	}

	/**
	 * API name: {@code doc_id}
	 */
	@Nullable
	public final String docId() {
		return this.docId;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Refresh refresh() {
		return this.refresh;
	}

	/**
	 * Required - API name: {@code source}
	 */
	public final JsonData source() {
		return this.source;
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

		if (this.docId != null) {
			generator.writeKey("doc_id");
			generator.write(this.docId);

		}
		generator.writeKey("index");
		generator.write(this.index);

		if (this.refresh != null) {
			generator.writeKey("refresh");
			this.refresh.serialize(generator, mapper);
		}
		generator.writeKey("source");
		this.source.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexResultRequestSummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexResultRequestSummary> {
		@Nullable
		private String docId;

		private String index;

		@Nullable
		private Refresh refresh;

		private JsonData source;

		public Builder() {
		}
		private Builder(IndexResultRequestSummary instance) {
			this.docId = instance.docId;
			this.index = instance.index;
			this.refresh = instance.refresh;
			this.source = instance.source;

		}
		/**
		 * API name: {@code doc_id}
		 */
		public final Builder docId(@Nullable String value) {
			this.docId = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Required - API name: {@code source}
		 */
		public final Builder source(JsonData value) {
			this.source = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexResultRequestSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexResultRequestSummary build() {
			_checkSingleUse();

			return new IndexResultRequestSummary(this);
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
	 * Json deserializer for {@link IndexResultRequestSummary}
	 */
	public static final JsonpDeserializer<IndexResultRequestSummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexResultRequestSummary::setupIndexResultRequestSummaryDeserializer);

	protected static void setupIndexResultRequestSummaryDeserializer(
			ObjectDeserializer<IndexResultRequestSummary.Builder> op) {

		op.add(Builder::docId, JsonpDeserializer.stringDeserializer(), "doc_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::refresh, Refresh._DESERIALIZER, "refresh");
		op.add(Builder::source, JsonData._DESERIALIZER, "source");

	}

}
