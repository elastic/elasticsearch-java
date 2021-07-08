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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.get_index_template.Response
public final class GetIndexTemplateResponse implements ToJsonp {
	private final List<IndexTemplateItem> indexTemplates;

	// ---------------------------------------------------------------------------------------------

	protected GetIndexTemplateResponse(Builder builder) {

		this.indexTemplates = Objects.requireNonNull(builder.indexTemplates, "index_templates");

	}

	/**
	 * API name: {@code index_templates}
	 */
	public List<IndexTemplateItem> indexTemplates() {
		return this.indexTemplates;
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

		generator.writeKey("index_templates");
		generator.writeStartArray();
		for (IndexTemplateItem item0 : this.indexTemplates) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetIndexTemplateResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetIndexTemplateResponse> {
		private List<IndexTemplateItem> indexTemplates;

		/**
		 * API name: {@code index_templates}
		 */
		public Builder indexTemplates(List<IndexTemplateItem> value) {
			this.indexTemplates = value;
			return this;
		}

		/**
		 * API name: {@code index_templates}
		 */
		public Builder indexTemplates(IndexTemplateItem... value) {
			this.indexTemplates = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indexTemplates(List)}, creating the list if needed.
		 */
		public Builder addIndexTemplates(IndexTemplateItem value) {
			if (this.indexTemplates == null) {
				this.indexTemplates = new ArrayList<>();
			}
			this.indexTemplates.add(value);
			return this;
		}

		/**
		 * Set {@link #indexTemplates(List)} to a singleton list.
		 */
		public Builder indexTemplates(Function<IndexTemplateItem.Builder, ObjectBuilder<IndexTemplateItem>> fn) {
			return this.indexTemplates(fn.apply(new IndexTemplateItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #indexTemplates(List)}, creating the list if needed.
		 */
		public Builder addIndexTemplates(Function<IndexTemplateItem.Builder, ObjectBuilder<IndexTemplateItem>> fn) {
			return this.addIndexTemplates(fn.apply(new IndexTemplateItem.Builder()).build());
		}

		/**
		 * Builds a {@link GetIndexTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetIndexTemplateResponse build() {

			return new GetIndexTemplateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetIndexTemplateResponse
	 */
	public static final JsonpDeserializer<GetIndexTemplateResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetIndexTemplateResponse::setupGetIndexTemplateResponseDeserializer);

	protected static void setupGetIndexTemplateResponseDeserializer(
			DelegatingDeserializer<GetIndexTemplateResponse.Builder> op) {

		op.add(Builder::indexTemplates, JsonpDeserializer.arrayDeserializer(IndexTemplateItem.DESERIALIZER),
				"index_templates");

	}

}
