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

package co.elastic.clients.elasticsearch.search_application.list;

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
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: search_application.list.SearchApplicationListItem

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#search_application.list.SearchApplicationListItem">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchApplicationListItem implements JsonpSerializable {
	private final String name;

	private final List<String> indices;

	private final long updatedAtMillis;

	@Nullable
	private final String analyticsCollectionName;

	// ---------------------------------------------------------------------------------------------

	private SearchApplicationListItem(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.updatedAtMillis = ApiTypeHelper.requireNonNull(builder.updatedAtMillis, this, "updatedAtMillis");
		this.analyticsCollectionName = builder.analyticsCollectionName;

	}

	public static SearchApplicationListItem of(Function<Builder, ObjectBuilder<SearchApplicationListItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Search Application name
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - Indices that are part of the Search Application
	 * <p>
	 * API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * Required - Last time the Search Application was updated
	 * <p>
	 * API name: {@code updated_at_millis}
	 */
	public final long updatedAtMillis() {
		return this.updatedAtMillis;
	}

	/**
	 * Analytics collection associated to the Search Application
	 * <p>
	 * API name: {@code analytics_collection_name}
	 */
	@Nullable
	public final String analyticsCollectionName() {
		return this.analyticsCollectionName;
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

		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("updated_at_millis");
		generator.write(this.updatedAtMillis);

		if (this.analyticsCollectionName != null) {
			generator.writeKey("analytics_collection_name");
			generator.write(this.analyticsCollectionName);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchApplicationListItem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SearchApplicationListItem> {
		private String name;

		private List<String> indices;

		private Long updatedAtMillis;

		@Nullable
		private String analyticsCollectionName;

		/**
		 * Required - Search Application name
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - Indices that are part of the Search Application
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<String> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Required - Indices that are part of the Search Application
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(String value, String... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Required - Last time the Search Application was updated
		 * <p>
		 * API name: {@code updated_at_millis}
		 */
		public final Builder updatedAtMillis(long value) {
			this.updatedAtMillis = value;
			return this;
		}

		/**
		 * Analytics collection associated to the Search Application
		 * <p>
		 * API name: {@code analytics_collection_name}
		 */
		public final Builder analyticsCollectionName(@Nullable String value) {
			this.analyticsCollectionName = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchApplicationListItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchApplicationListItem build() {
			_checkSingleUse();

			return new SearchApplicationListItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchApplicationListItem}
	 */
	public static final JsonpDeserializer<SearchApplicationListItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SearchApplicationListItem::setupSearchApplicationListItemDeserializer);

	protected static void setupSearchApplicationListItemDeserializer(
			ObjectDeserializer<SearchApplicationListItem.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::updatedAtMillis, JsonpDeserializer.longDeserializer(), "updated_at_millis");
		op.add(Builder::analyticsCollectionName, JsonpDeserializer.stringDeserializer(), "analytics_collection_name");

	}

}
