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

package co.elastic.clients.elasticsearch.inference;

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

// typedef: inference._types.HuggingFaceTaskSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.HuggingFaceTaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class HuggingFaceTaskSettings implements JsonpSerializable {
	@Nullable
	private final Boolean returnDocuments;

	@Nullable
	private final Integer topN;

	// ---------------------------------------------------------------------------------------------

	private HuggingFaceTaskSettings(Builder builder) {

		this.returnDocuments = builder.returnDocuments;
		this.topN = builder.topN;

	}

	public static HuggingFaceTaskSettings of(Function<Builder, ObjectBuilder<HuggingFaceTaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * For a <code>rerank</code> task, return doc text within the results.
	 * <p>
	 * API name: {@code return_documents}
	 */
	@Nullable
	public final Boolean returnDocuments() {
		return this.returnDocuments;
	}

	/**
	 * For a <code>rerank</code> task, the number of most relevant documents to
	 * return. It defaults to the number of the documents.
	 * <p>
	 * API name: {@code top_n}
	 */
	@Nullable
	public final Integer topN() {
		return this.topN;
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

		if (this.returnDocuments != null) {
			generator.writeKey("return_documents");
			generator.write(this.returnDocuments);

		}
		if (this.topN != null) {
			generator.writeKey("top_n");
			generator.write(this.topN);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HuggingFaceTaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<HuggingFaceTaskSettings> {
		@Nullable
		private Boolean returnDocuments;

		@Nullable
		private Integer topN;

		/**
		 * For a <code>rerank</code> task, return doc text within the results.
		 * <p>
		 * API name: {@code return_documents}
		 */
		public final Builder returnDocuments(@Nullable Boolean value) {
			this.returnDocuments = value;
			return this;
		}

		/**
		 * For a <code>rerank</code> task, the number of most relevant documents to
		 * return. It defaults to the number of the documents.
		 * <p>
		 * API name: {@code top_n}
		 */
		public final Builder topN(@Nullable Integer value) {
			this.topN = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HuggingFaceTaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HuggingFaceTaskSettings build() {
			_checkSingleUse();

			return new HuggingFaceTaskSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HuggingFaceTaskSettings}
	 */
	public static final JsonpDeserializer<HuggingFaceTaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HuggingFaceTaskSettings::setupHuggingFaceTaskSettingsDeserializer);

	protected static void setupHuggingFaceTaskSettingsDeserializer(
			ObjectDeserializer<HuggingFaceTaskSettings.Builder> op) {

		op.add(Builder::returnDocuments, JsonpDeserializer.booleanDeserializer(), "return_documents");
		op.add(Builder::topN, JsonpDeserializer.integerDeserializer(), "top_n");

	}

}
