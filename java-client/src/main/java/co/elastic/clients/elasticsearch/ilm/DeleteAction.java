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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: ilm._types.DeleteAction

/**
 *
 * @see <a href="../doc-files/api-spec.html#ilm._types.DeleteAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class DeleteAction implements JsonpSerializable {
	@Nullable
	private final Boolean deleteSearchableSnapshot;

	// ---------------------------------------------------------------------------------------------

	private DeleteAction(Builder builder) {

		this.deleteSearchableSnapshot = builder.deleteSearchableSnapshot;

	}

	public static DeleteAction of(Function<Builder, ObjectBuilder<DeleteAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code delete_searchable_snapshot}
	 */
	@Nullable
	public final Boolean deleteSearchableSnapshot() {
		return this.deleteSearchableSnapshot;
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

		if (this.deleteSearchableSnapshot != null) {
			generator.writeKey("delete_searchable_snapshot");
			generator.write(this.deleteSearchableSnapshot);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DeleteAction> {
		@Nullable
		private Boolean deleteSearchableSnapshot;

		/**
		 * API name: {@code delete_searchable_snapshot}
		 */
		public final Builder deleteSearchableSnapshot(@Nullable Boolean value) {
			this.deleteSearchableSnapshot = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteAction build() {
			_checkSingleUse();

			return new DeleteAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeleteAction}
	 */
	public static final JsonpDeserializer<DeleteAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DeleteAction::setupDeleteActionDeserializer);

	protected static void setupDeleteActionDeserializer(ObjectDeserializer<DeleteAction.Builder> op) {

		op.add(Builder::deleteSearchableSnapshot, JsonpDeserializer.booleanDeserializer(),
				"delete_searchable_snapshot");

	}

}
