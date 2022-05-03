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

package co.elastic.clients.elasticsearch.security.put_privileges;

import co.elastic.clients.json.JsonData;
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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.put_privileges.Actions

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.put_privileges.Actions">API
 *      specification</a>
 */
@JsonpDeserializable
public class Actions implements JsonpSerializable {
	private final List<String> actions;

	@Nullable
	private final String application;

	@Nullable
	private final String name;

	private final Map<String, JsonData> metadata;

	// ---------------------------------------------------------------------------------------------

	private Actions(Builder builder) {

		this.actions = ApiTypeHelper.unmodifiableRequired(builder.actions, this, "actions");
		this.application = builder.application;
		this.name = builder.name;
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);

	}

	public static Actions of(Function<Builder, ObjectBuilder<Actions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code actions}
	 */
	public final List<String> actions() {
		return this.actions;
	}

	/**
	 * API name: {@code application}
	 */
	@Nullable
	public final String application() {
		return this.application;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
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

		if (ApiTypeHelper.isDefined(this.actions)) {
			generator.writeKey("actions");
			generator.writeStartArray();
			for (String item0 : this.actions) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.application != null) {
			generator.writeKey("application");
			generator.write(this.application);

		}
		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}
		if (ApiTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
	 * Builder for {@link Actions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Actions> {
		private List<String> actions;

		@Nullable
		private String application;

		@Nullable
		private String name;

		@Nullable
		private Map<String, JsonData> metadata;

		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>actions</code>.
		 */
		public final Builder actions(List<String> list) {
			this.actions = _listAddAll(this.actions, list);
			return this;
		}

		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds one or more values to <code>actions</code>.
		 */
		public final Builder actions(String value, String... values) {
			this.actions = _listAdd(this.actions, value, values);
			return this;
		}

		/**
		 * API name: {@code application}
		 */
		public final Builder application(@Nullable String value) {
			this.application = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Actions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Actions build() {
			_checkSingleUse();

			return new Actions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Actions}
	 */
	public static final JsonpDeserializer<Actions> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Actions::setupActionsDeserializer);

	protected static void setupActionsDeserializer(ObjectDeserializer<Actions.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"actions");
		op.add(Builder::application, JsonpDeserializer.stringDeserializer(), "application");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");

	}

}
