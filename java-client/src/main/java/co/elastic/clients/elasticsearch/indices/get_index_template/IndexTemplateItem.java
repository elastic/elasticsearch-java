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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.get_index_template.IndexTemplateItem
public final class IndexTemplateItem implements ToJsonp {
	private final String name;

	private final IndexTemplate indexTemplate;

	// ---------------------------------------------------------------------------------------------

	protected IndexTemplateItem(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.indexTemplate = Objects.requireNonNull(builder.indexTemplate, "index_template");

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code index_template}
	 */
	public IndexTemplate indexTemplate() {
		return this.indexTemplate;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("index_template");
		this.indexTemplate.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexTemplateItem}.
	 */
	public static class Builder implements ObjectBuilder<IndexTemplateItem> {
		private String name;

		private IndexTemplate indexTemplate;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code index_template}
		 */
		public Builder indexTemplate(IndexTemplate value) {
			this.indexTemplate = value;
			return this;
		}

		/**
		 * API name: {@code index_template}
		 */
		public Builder indexTemplate(Function<IndexTemplate.Builder, ObjectBuilder<IndexTemplate>> fn) {
			return this.indexTemplate(fn.apply(new IndexTemplate.Builder()).build());
		}

		/**
		 * Builds a {@link IndexTemplateItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexTemplateItem build() {

			return new IndexTemplateItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndexTemplateItem
	 */
	public static final JsonpDeserializer<IndexTemplateItem> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndexTemplateItem::setupIndexTemplateItemDeserializer);

	protected static void setupIndexTemplateItemDeserializer(DelegatingDeserializer<IndexTemplateItem.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::indexTemplate, IndexTemplate.DESERIALIZER, "index_template");

	}

}
