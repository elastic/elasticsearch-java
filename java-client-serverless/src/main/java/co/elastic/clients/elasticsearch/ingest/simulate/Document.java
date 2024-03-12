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

package co.elastic.clients.elasticsearch.ingest.simulate;

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

// typedef: ingest.simulate.Document

/**
 *
 * @see <a href="../../doc-files/api-spec.html#ingest.simulate.Document">API
 *      specification</a>
 */
@JsonpDeserializable
public class Document implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final String index;

	private final JsonData source;

	// ---------------------------------------------------------------------------------------------

	private Document(Builder builder) {

		this.id = builder.id;
		this.index = builder.index;
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");

	}

	public static Document of(Function<Builder, ObjectBuilder<Document>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Unique identifier for the document. This ID must be unique within the
	 * <code>_index</code>.
	 * <p>
	 * API name: {@code _id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * Name of the index containing the document.
	 * <p>
	 * API name: {@code _index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * Required - JSON body for the document.
	 * <p>
	 * API name: {@code _source}
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

		if (this.id != null) {
			generator.writeKey("_id");
			generator.write(this.id);

		}
		if (this.index != null) {
			generator.writeKey("_index");
			generator.write(this.index);

		}
		generator.writeKey("_source");
		this.source.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Document}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Document> {
		@Nullable
		private String id;

		@Nullable
		private String index;

		private JsonData source;

		/**
		 * Unique identifier for the document. This ID must be unique within the
		 * <code>_index</code>.
		 * <p>
		 * API name: {@code _id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Name of the index containing the document.
		 * <p>
		 * API name: {@code _index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - JSON body for the document.
		 * <p>
		 * API name: {@code _source}
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
		 * Builds a {@link Document}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Document build() {
			_checkSingleUse();

			return new Document(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Document}
	 */
	public static final JsonpDeserializer<Document> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Document::setupDocumentDeserializer);

	protected static void setupDocumentDeserializer(ObjectDeserializer<Document.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::source, JsonData._DESERIALIZER, "_source");

	}

}
