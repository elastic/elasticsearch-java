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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
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

// typedef: ilm._types.SearchableSnapshotAction

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ilm._types.SearchableSnapshotAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchableSnapshotAction implements JsonpSerializable {
	private final String snapshotRepository;

	@Nullable
	private final Boolean forceMergeIndex;

	// ---------------------------------------------------------------------------------------------

	private SearchableSnapshotAction(Builder builder) {

		this.snapshotRepository = ApiTypeHelper.requireNonNull(builder.snapshotRepository, this, "snapshotRepository");
		this.forceMergeIndex = builder.forceMergeIndex;

	}

	public static SearchableSnapshotAction of(Function<Builder, ObjectBuilder<SearchableSnapshotAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code snapshot_repository}
	 */
	public final String snapshotRepository() {
		return this.snapshotRepository;
	}

	/**
	 * API name: {@code force_merge_index}
	 */
	@Nullable
	public final Boolean forceMergeIndex() {
		return this.forceMergeIndex;
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

		generator.writeKey("snapshot_repository");
		generator.write(this.snapshotRepository);

		if (this.forceMergeIndex != null) {
			generator.writeKey("force_merge_index");
			generator.write(this.forceMergeIndex);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchableSnapshotAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SearchableSnapshotAction> {
		private String snapshotRepository;

		@Nullable
		private Boolean forceMergeIndex;

		/**
		 * Required - API name: {@code snapshot_repository}
		 */
		public final Builder snapshotRepository(String value) {
			this.snapshotRepository = value;
			return this;
		}

		/**
		 * API name: {@code force_merge_index}
		 */
		public final Builder forceMergeIndex(@Nullable Boolean value) {
			this.forceMergeIndex = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchableSnapshotAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchableSnapshotAction build() {
			_checkSingleUse();

			return new SearchableSnapshotAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchableSnapshotAction}
	 */
	public static final JsonpDeserializer<SearchableSnapshotAction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SearchableSnapshotAction::setupSearchableSnapshotActionDeserializer);

	protected static void setupSearchableSnapshotActionDeserializer(
			ObjectDeserializer<SearchableSnapshotAction.Builder> op) {

		op.add(Builder::snapshotRepository, JsonpDeserializer.stringDeserializer(), "snapshot_repository");
		op.add(Builder::forceMergeIndex, JsonpDeserializer.booleanDeserializer(), "force_merge_index");

	}

}
