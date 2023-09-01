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

package co.elastic.clients.elasticsearch.indices.get_index_template;

import co.elastic.clients.elasticsearch.indices.IndexTemplate;
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

// typedef: indices.get_index_template.IndexTemplateItem

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.get_index_template.IndexTemplateItem">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexTemplateItem implements JsonpSerializable {
	private final String name;

	private final IndexTemplate indexTemplate;

	// ---------------------------------------------------------------------------------------------

	private IndexTemplateItem(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.indexTemplate = ApiTypeHelper.requireNonNull(builder.indexTemplate, this, "indexTemplate");

	}

	public static IndexTemplateItem of(Function<Builder, ObjectBuilder<IndexTemplateItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code index_template}
	 */
	public final IndexTemplate indexTemplate() {
		return this.indexTemplate;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("index_template");
		this.indexTemplate.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexTemplateItem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IndexTemplateItem> {
		private String name;

		private IndexTemplate indexTemplate;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_template}
		 */
		public final Builder indexTemplate(IndexTemplate value) {
			this.indexTemplate = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_template}
		 */
		public final Builder indexTemplate(Function<IndexTemplate.Builder, ObjectBuilder<IndexTemplate>> fn) {
			return this.indexTemplate(fn.apply(new IndexTemplate.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexTemplateItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexTemplateItem build() {
			_checkSingleUse();

			return new IndexTemplateItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexTemplateItem}
	 */
	public static final JsonpDeserializer<IndexTemplateItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexTemplateItem::setupIndexTemplateItemDeserializer);

	protected static void setupIndexTemplateItemDeserializer(ObjectDeserializer<IndexTemplateItem.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::indexTemplate, IndexTemplate._DESERIALIZER, "index_template");

	}

}
