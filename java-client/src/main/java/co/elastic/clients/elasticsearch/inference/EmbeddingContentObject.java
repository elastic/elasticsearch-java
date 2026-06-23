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
import java.util.List;
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

// typedef: inference._types.EmbeddingContentObject

/**
 * A wrapper object which contains the fields required to specify multimodal
 * inputs
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.EmbeddingContentObject">API
 *      specification</a>
 */
@JsonpDeserializable
public class EmbeddingContentObject implements JsonpSerializable {
	private final List<EmbeddingContentObjectItem> content;

	// ---------------------------------------------------------------------------------------------

	private EmbeddingContentObject(Builder builder) {

		this.content = ApiTypeHelper.unmodifiableRequired(builder.content, this, "content");

	}

	public static EmbeddingContentObject of(Function<Builder, ObjectBuilder<EmbeddingContentObject>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - An object or an array of objects containing the input data for the
	 * model to embed
	 * <p>
	 * API name: {@code content}
	 */
	public final List<EmbeddingContentObjectItem> content() {
		return this.content;
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

		if (ApiTypeHelper.isDefined(this.content)) {
			generator.writeKey("content");
			generator.writeStartArray();
			for (EmbeddingContentObjectItem item0 : this.content) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EmbeddingContentObject}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EmbeddingContentObject> {
		private List<EmbeddingContentObjectItem> content;

		public Builder() {
		}
		private Builder(EmbeddingContentObject instance) {
			this.content = instance.content;

		}
		/**
		 * Required - An object or an array of objects containing the input data for the
		 * model to embed
		 * <p>
		 * API name: {@code content}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>content</code>.
		 */
		public final Builder content(List<EmbeddingContentObjectItem> list) {
			this.content = _listAddAll(this.content, list);
			return this;
		}

		/**
		 * Required - An object or an array of objects containing the input data for the
		 * model to embed
		 * <p>
		 * API name: {@code content}
		 * <p>
		 * Adds one or more values to <code>content</code>.
		 */
		public final Builder content(EmbeddingContentObjectItem value, EmbeddingContentObjectItem... values) {
			this.content = _listAdd(this.content, value, values);
			return this;
		}

		/**
		 * Required - An object or an array of objects containing the input data for the
		 * model to embed
		 * <p>
		 * API name: {@code content}
		 * <p>
		 * Adds a value to <code>content</code> using a builder lambda.
		 */
		public final Builder content(
				Function<EmbeddingContentObjectItem.Builder, ObjectBuilder<EmbeddingContentObjectItem>> fn) {
			return content(fn.apply(new EmbeddingContentObjectItem.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EmbeddingContentObject}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EmbeddingContentObject build() {
			_checkSingleUse();

			return new EmbeddingContentObject(this);
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
	 * Json deserializer for {@link EmbeddingContentObject}
	 */
	public static final JsonpDeserializer<EmbeddingContentObject> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EmbeddingContentObject::setupEmbeddingContentObjectDeserializer);

	protected static void setupEmbeddingContentObjectDeserializer(
			ObjectDeserializer<EmbeddingContentObject.Builder> op) {

		op.add(Builder::content, JsonpDeserializer.arrayDeserializer(EmbeddingContentObjectItem._DESERIALIZER),
				"content");

	}

}
