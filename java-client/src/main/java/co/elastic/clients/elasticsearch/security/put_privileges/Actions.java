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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security.put_privileges.Actions
public final class Actions implements JsonpSerializable {
	private final List<String> actions;

	@Nullable
	private final String application;

	@Nullable
	private final String name;

	@Nullable
	private final Map<String, JsonData> metadata;

	// ---------------------------------------------------------------------------------------------

	public Actions(Builder builder) {

		this.actions = Objects.requireNonNull(builder.actions, "actions");
		this.application = builder.application;
		this.name = builder.name;
		this.metadata = builder.metadata;

	}

	/**
	 * API name: {@code actions}
	 */
	public List<String> actions() {
		return this.actions;
	}

	/**
	 * API name: {@code application}
	 */
	@Nullable
	public String application() {
		return this.application;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code metadata}
	 */
	@Nullable
	public Map<String, JsonData> metadata() {
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

		generator.writeKey("actions");
		generator.writeStartArray();
		for (String item0 : this.actions) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.application != null) {

			generator.writeKey("application");
			generator.write(this.application);

		}
		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.metadata != null) {

			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Actions}.
	 */
	public static class Builder implements ObjectBuilder<Actions> {
		private List<String> actions;

		@Nullable
		private String application;

		@Nullable
		private String name;

		@Nullable
		private Map<String, JsonData> metadata;

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(List<String> value) {
			this.actions = value;
			return this;
		}

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(String... value) {
			this.actions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #actions(List)}, creating the list if needed.
		 */
		public Builder addActions(String value) {
			if (this.actions == null) {
				this.actions = new ArrayList<>();
			}
			this.actions.add(value);
			return this;
		}

		/**
		 * API name: {@code application}
		 */
		public Builder application(@Nullable String value) {
			this.application = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonData value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link Actions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Actions build() {

			return new Actions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Actions}
	 */
	public static final JsonpDeserializer<Actions> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Actions::setupActionsDeserializer);

	protected static void setupActionsDeserializer(DelegatingDeserializer<Actions.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"actions");
		op.add(Builder::application, JsonpDeserializer.stringDeserializer(), "application");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER), "metadata");

	}

}
