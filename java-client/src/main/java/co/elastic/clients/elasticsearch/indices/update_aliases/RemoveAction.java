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
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.update_aliases.RemoveAction

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.update_aliases.RemoveAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class RemoveAction implements ActionVariant, JsonpSerializable {
	@Nullable
	private final String alias;

	private final List<String> aliases;

	@Nullable
	private final String index;

	private final List<String> indices;

	@Nullable
	private final Boolean mustExist;

	// ---------------------------------------------------------------------------------------------

	private RemoveAction(Builder builder) {

		this.alias = builder.alias;
		this.aliases = ApiTypeHelper.unmodifiable(builder.aliases);
		this.index = builder.index;
		this.indices = ApiTypeHelper.unmodifiable(builder.indices);
		this.mustExist = builder.mustExist;

	}

	public static RemoveAction of(Function<Builder, ObjectBuilder<RemoveAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Action variant kind.
	 */
	@Override
	public Action.Kind _actionKind() {
		return Action.Kind.Remove;
	}

	/**
	 * Alias for the action. Index alias names support date math.
	 * <p>
	 * API name: {@code alias}
	 */
	@Nullable
	public final String alias() {
		return this.alias;
	}

	/**
	 * Aliases for the action. Index alias names support date math.
	 * <p>
	 * API name: {@code aliases}
	 */
	public final List<String> aliases() {
		return this.aliases;
	}

	/**
	 * Data stream or index for the action. Supports wildcards (<code>*</code>).
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * Data streams or indices for the action. Supports wildcards (<code>*</code>).
	 * <p>
	 * API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * If <code>true</code>, the alias must exist to perform the action.
	 * <p>
	 * API name: {@code must_exist}
	 */
	@Nullable
	public final Boolean mustExist() {
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
		if (ApiTypeHelper.isDefined(this.aliases)) {
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
		if (ApiTypeHelper.isDefined(this.indices)) {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RemoveAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RemoveAction> {
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
		 * Alias for the action. Index alias names support date math.
		 * <p>
		 * API name: {@code alias}
		 */
		public final Builder alias(@Nullable String value) {
			this.alias = value;
			return this;
		}

		/**
		 * Aliases for the action. Index alias names support date math.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>aliases</code>.
		 */
		public final Builder aliases(List<String> list) {
			this.aliases = _listAddAll(this.aliases, list);
			return this;
		}

		/**
		 * Aliases for the action. Index alias names support date math.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds one or more values to <code>aliases</code>.
		 */
		public final Builder aliases(String value, String... values) {
			this.aliases = _listAdd(this.aliases, value, values);
			return this;
		}

		/**
		 * Data stream or index for the action. Supports wildcards (<code>*</code>).
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * Data streams or indices for the action. Supports wildcards (<code>*</code>).
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
		 * Data streams or indices for the action. Supports wildcards (<code>*</code>).
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
		 * If <code>true</code>, the alias must exist to perform the action.
		 * <p>
		 * API name: {@code must_exist}
		 */
		public final Builder mustExist(@Nullable Boolean value) {
			this.mustExist = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RemoveAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemoveAction build() {
			_checkSingleUse();

			return new RemoveAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RemoveAction}
	 */
	public static final JsonpDeserializer<RemoveAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RemoveAction::setupRemoveActionDeserializer);

	protected static void setupRemoveActionDeserializer(ObjectDeserializer<RemoveAction.Builder> op) {

		op.add(Builder::alias, JsonpDeserializer.stringDeserializer(), "alias");
		op.add(Builder::aliases, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"aliases");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::mustExist, JsonpDeserializer.booleanDeserializer(), "must_exist");

	}

}
