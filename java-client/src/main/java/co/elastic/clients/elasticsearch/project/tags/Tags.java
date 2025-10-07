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

package co.elastic.clients.elasticsearch.project.tags;

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
import java.util.HashMap;
import java.util.Map;
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

// typedef: project.tags.Tags

/**
 *
 * @see <a href="../../doc-files/api-spec.html#project.tags.Tags">API
 *      specification</a>
 */
@JsonpDeserializable
public class Tags implements JsonpSerializable {
	private final Map<String, String> userDefinedTags;

	private final String id;

	private final String alias;

	private final String type;

	private final String organisation;

	// ---------------------------------------------------------------------------------------------

	private Tags(Builder builder) {

		this.userDefinedTags = ApiTypeHelper.unmodifiable(builder.userDefinedTags);

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.alias = ApiTypeHelper.requireNonNull(builder.alias, this, "alias");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.organisation = ApiTypeHelper.requireNonNull(builder.organisation, this, "organisation");

	}

	public static Tags of(Function<Builder, ObjectBuilder<Tags>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Additional tags defined by user
	 */
	public final Map<String, String> userDefinedTags() {
		return this.userDefinedTags;
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code _alias}
	 */
	public final String alias() {
		return this.alias;
	}

	/**
	 * Required - API name: {@code _type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code _organisation}
	 */
	public final String organisation() {
		return this.organisation;
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

		for (Map.Entry<String, String> item0 : this.userDefinedTags.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_alias");
		generator.write(this.alias);

		generator.writeKey("_type");
		generator.write(this.type);

		generator.writeKey("_organisation");
		generator.write(this.organisation);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Tags}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Tags> {
		@Nullable
		private Map<String, String> userDefinedTags = new HashMap<>();

		/**
		 * Additional tags defined by user
		 * <p>
		 * Adds all entries of <code>map</code> to <code>userDefinedTags</code>.
		 */
		public final Builder userDefinedTags(Map<String, String> map) {
			this.userDefinedTags = _mapPutAll(this.userDefinedTags, map);
			return this;
		}

		/**
		 * Additional tags defined by user
		 * <p>
		 * Adds an entry to <code>userDefinedTags</code>.
		 */
		public final Builder userDefinedTags(String key, String value) {
			this.userDefinedTags = _mapPut(this.userDefinedTags, key, value);
			return this;
		}

		private String id;

		private String alias;

		private String type;

		private String organisation;

		/**
		 * Required - API name: {@code _id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code _alias}
		 */
		public final Builder alias(String value) {
			this.alias = value;
			return this;
		}

		/**
		 * Required - API name: {@code _type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code _organisation}
		 */
		public final Builder organisation(String value) {
			this.organisation = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Tags}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Tags build() {
			_checkSingleUse();

			return new Tags(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Tags}
	 */
	public static final JsonpDeserializer<Tags> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Tags::setupTagsDeserializer);

	protected static void setupTagsDeserializer(ObjectDeserializer<Tags.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::alias, JsonpDeserializer.stringDeserializer(), "_alias");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::organisation, JsonpDeserializer.stringDeserializer(), "_organisation");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.userDefinedTags(name, JsonpDeserializer.stringDeserializer().deserialize(parser, mapper));
		});

	}

}
