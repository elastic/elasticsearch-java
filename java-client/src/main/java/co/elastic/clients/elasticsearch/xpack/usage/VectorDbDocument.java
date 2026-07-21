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

// typedef: xpack.usage.VectorDbDocument

/**
 * Usage statistics for indices using the <code>vectordb_document</code> index
 * mode.
 * 
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.VectorDbDocument">API
 *      specification</a>
 */
@JsonpDeserializable
public class VectorDbDocument extends Base {
	private final int indicesCount;

	private final long numDocs;

	// ---------------------------------------------------------------------------------------------

	private VectorDbDocument(Builder builder) {
		super(builder);

		this.indicesCount = ApiTypeHelper.requireNonNull(builder.indicesCount, this, "indicesCount", 0);
		this.numDocs = ApiTypeHelper.requireNonNull(builder.numDocs, this, "numDocs", 0);

	}

	public static VectorDbDocument of(Function<Builder, ObjectBuilder<VectorDbDocument>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of indices using the <code>vectordb_document</code>
	 * index mode.
	 * <p>
	 * API name: {@code indices_count}
	 */
	public final int indicesCount() {
		return this.indicesCount;
	}

	/**
	 * Required - The total number of documents held across all
	 * <code>vectordb_document</code> indices.
	 * <p>
	 * API name: {@code num_docs}
	 */
	public final long numDocs() {
		return this.numDocs;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("indices_count");
		generator.write(this.indicesCount);

		generator.writeKey("num_docs");
		generator.write(this.numDocs);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VectorDbDocument}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<VectorDbDocument> {
		private Integer indicesCount;

		private Long numDocs;

		public Builder() {
		}
		private Builder(VectorDbDocument instance) {
			this.indicesCount = instance.indicesCount;
			this.numDocs = instance.numDocs;

		}
		/**
		 * Required - The number of indices using the <code>vectordb_document</code>
		 * index mode.
		 * <p>
		 * API name: {@code indices_count}
		 */
		public final Builder indicesCount(int value) {
			this.indicesCount = value;
			return this;
		}

		/**
		 * Required - The total number of documents held across all
		 * <code>vectordb_document</code> indices.
		 * <p>
		 * API name: {@code num_docs}
		 */
		public final Builder numDocs(long value) {
			this.numDocs = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link VectorDbDocument}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VectorDbDocument build() {
			_checkSingleUse();

			return new VectorDbDocument(this);
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
	 * Json deserializer for {@link VectorDbDocument}
	 */
	public static final JsonpDeserializer<VectorDbDocument> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			VectorDbDocument::setupVectorDbDocumentDeserializer);

	protected static void setupVectorDbDocumentDeserializer(ObjectDeserializer<VectorDbDocument.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::indicesCount, JsonpDeserializer.integerDeserializer(), "indices_count");
		op.add(Builder::numDocs, JsonpDeserializer.longDeserializer(), "num_docs");

	}

}
