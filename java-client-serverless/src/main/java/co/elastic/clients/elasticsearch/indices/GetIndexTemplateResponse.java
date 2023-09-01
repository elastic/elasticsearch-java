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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch.indices.get_index_template.IndexTemplateItem;
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

// typedef: indices.get_index_template.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.get_index_template.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetIndexTemplateResponse implements JsonpSerializable {
	private final List<IndexTemplateItem> indexTemplates;

	// ---------------------------------------------------------------------------------------------

	private GetIndexTemplateResponse(Builder builder) {

		this.indexTemplates = ApiTypeHelper.unmodifiableRequired(builder.indexTemplates, this, "indexTemplates");

	}

	public static GetIndexTemplateResponse of(Function<Builder, ObjectBuilder<GetIndexTemplateResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index_templates}
	 */
	public final List<IndexTemplateItem> indexTemplates() {
		return this.indexTemplates;
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

		if (ApiTypeHelper.isDefined(this.indexTemplates)) {
			generator.writeKey("index_templates");
			generator.writeStartArray();
			for (IndexTemplateItem item0 : this.indexTemplates) {
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
	 * Builder for {@link GetIndexTemplateResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetIndexTemplateResponse> {
		private List<IndexTemplateItem> indexTemplates;

		/**
		 * Required - API name: {@code index_templates}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indexTemplates</code>.
		 */
		public final Builder indexTemplates(List<IndexTemplateItem> list) {
			this.indexTemplates = _listAddAll(this.indexTemplates, list);
			return this;
		}

		/**
		 * Required - API name: {@code index_templates}
		 * <p>
		 * Adds one or more values to <code>indexTemplates</code>.
		 */
		public final Builder indexTemplates(IndexTemplateItem value, IndexTemplateItem... values) {
			this.indexTemplates = _listAdd(this.indexTemplates, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code index_templates}
		 * <p>
		 * Adds a value to <code>indexTemplates</code> using a builder lambda.
		 */
		public final Builder indexTemplates(Function<IndexTemplateItem.Builder, ObjectBuilder<IndexTemplateItem>> fn) {
			return indexTemplates(fn.apply(new IndexTemplateItem.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetIndexTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetIndexTemplateResponse build() {
			_checkSingleUse();

			return new GetIndexTemplateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetIndexTemplateResponse}
	 */
	public static final JsonpDeserializer<GetIndexTemplateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetIndexTemplateResponse::setupGetIndexTemplateResponseDeserializer);

	protected static void setupGetIndexTemplateResponseDeserializer(
			ObjectDeserializer<GetIndexTemplateResponse.Builder> op) {

		op.add(Builder::indexTemplates, JsonpDeserializer.arrayDeserializer(IndexTemplateItem._DESERIALIZER),
				"index_templates");

	}

}
