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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.lang.Integer;
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

// typedef: inference._types.RankedDocument

/**
 * The rerank result object representing a single ranked document id: the
 * original index of the document in the request score: the score of the
 * document relative to the query text: Optional, the text of the document, if
 * requested
 * 
 * @see <a href="../doc-files/api-spec.html#inference._types.RankedDocument">API
 *      specification</a>
 */
@JsonpDeserializable
public class RankedDocument implements JsonpSerializable {
	private final int index;

	private final float score;

	@Nullable
	private final String text;

	// ---------------------------------------------------------------------------------------------

	private RankedDocument(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.score = ApiTypeHelper.requireNonNull(builder.score, this, "score");
		this.text = builder.text;

	}

	public static RankedDocument of(Function<Builder, ObjectBuilder<RankedDocument>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final int index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code score}
	 */
	public final float score() {
		return this.score;
	}

	/**
	 * API name: {@code text}
	 */
	@Nullable
	public final String text() {
		return this.text;
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

		generator.writeKey("score");
		generator.write(this.score);

		if (this.text != null) {
			generator.writeKey("text");
			generator.write(this.text);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankedDocument}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RankedDocument> {
		private Integer index;

		private Float score;

		@Nullable
		private String text;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(int value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code score}
		 */
		public final Builder score(float value) {
			this.score = value;
			return this;
		}

		/**
		 * API name: {@code text}
		 */
		public final Builder text(@Nullable String value) {
			this.text = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankedDocument}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankedDocument build() {
			_checkSingleUse();

			return new RankedDocument(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankedDocument}
	 */
	public static final JsonpDeserializer<RankedDocument> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RankedDocument::setupRankedDocumentDeserializer);

	protected static void setupRankedDocumentDeserializer(ObjectDeserializer<RankedDocument.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.integerDeserializer(), "index");
		op.add(Builder::score, JsonpDeserializer.floatDeserializer(), "score");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");

	}

}
