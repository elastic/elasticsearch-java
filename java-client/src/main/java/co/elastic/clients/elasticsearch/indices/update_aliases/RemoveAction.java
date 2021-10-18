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

package co.elastic.clients.elasticsearch.indices.update_aliases;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.update_aliases.RemoveAction
@JsonpDeserializable
public final class RemoveAction implements ActionVariant, JsonpSerializable {
	@Nullable
	private final String alias;

	@Nullable
	private final List<String> aliases;

	@Nullable
	private final String index;

	@Nullable
	private final List<String> indices;

	@Nullable
	private final Boolean mustExist;

	// ---------------------------------------------------------------------------------------------

	public RemoveAction(Builder builder) {

		this.alias = builder.alias;
		this.aliases = ModelTypeHelper.unmodifiable(builder.aliases);
		this.index = builder.index;
		this.indices = ModelTypeHelper.unmodifiable(builder.indices);
		this.mustExist = builder.mustExist;

	}

	public RemoveAction(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Action} variant type
	 */
	@Override
	public String _variantType() {
		return "remove";
	}

	/**
	 * API name: {@code alias}
	 */
	@Nullable
	public String alias() {
		return this.alias;
	}

	/**
	 * API name: {@code aliases}
	 */
	@Nullable
	public List<String> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code indices}
	 */
	@Nullable
	public List<String> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code must_exist}
	 */
	@Nullable
	public Boolean mustExist() {
		return this.mustExist;
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

		if (this.alias != null) {

			generator.writeKey("alias");
			generator.write(this.alias);

		}
		if (this.aliases != null) {

			generator.writeKey("aliases");
			generator.writeStartArray();
			for (String item0 : this.aliases) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.index != null) {

			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.indices != null) {

			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.mustExist != null) {

			generator.writeKey("must_exist");
			generator.write(this.mustExist);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RemoveAction}.
	 */
	public static class Builder implements ObjectBuilder<RemoveAction> {
		@Nullable
		private String alias;

		@Nullable
		private List<String> aliases;

		@Nullable
		private String index;

		@Nullable
		private List<String> indices;

		@Nullable
		private Boolean mustExist;

		/**
		 * API name: {@code alias}
		 */
		public Builder alias(@Nullable String value) {
			this.alias = value;
			return this;
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(@Nullable List<String> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(String... value) {
			this.aliases = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #aliases(List)}, creating the list if needed.
		 */
		public Builder addAliases(String value) {
			if (this.aliases == null) {
				this.aliases = new ArrayList<>();
			}
			this.aliases.add(value);
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(@Nullable List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(String value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * API name: {@code must_exist}
		 */
		public Builder mustExist(@Nullable Boolean value) {
			this.mustExist = value;
			return this;
		}

		/**
		 * Builds a {@link RemoveAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemoveAction build() {

			return new RemoveAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RemoveAction}
	 */
	public static final JsonpDeserializer<RemoveAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RemoveAction::setupRemoveActionDeserializer, Builder::build);

	protected static void setupRemoveActionDeserializer(DelegatingDeserializer<RemoveAction.Builder> op) {

		op.add(Builder::alias, JsonpDeserializer.stringDeserializer(), "alias");
		op.add(Builder::aliases, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"aliases");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::mustExist, JsonpDeserializer.booleanDeserializer(), "must_exist");

	}

}
