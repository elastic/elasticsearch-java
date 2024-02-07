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

package co.elastic.clients.elasticsearch.core.health_report;

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

// typedef: _global.health_report.RepositoryIntegrityIndicatorDetails

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.RepositoryIntegrityIndicatorDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class RepositoryIntegrityIndicatorDetails implements JsonpSerializable {
	@Nullable
	private final Long totalRepositories;

	@Nullable
	private final Long corruptedRepositories;

	private final List<String> corrupted;

	// ---------------------------------------------------------------------------------------------

	private RepositoryIntegrityIndicatorDetails(Builder builder) {

		this.totalRepositories = builder.totalRepositories;
		this.corruptedRepositories = builder.corruptedRepositories;
		this.corrupted = ApiTypeHelper.unmodifiable(builder.corrupted);

	}

	public static RepositoryIntegrityIndicatorDetails of(
			Function<Builder, ObjectBuilder<RepositoryIntegrityIndicatorDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code total_repositories}
	 */
	@Nullable
	public final Long totalRepositories() {
		return this.totalRepositories;
	}

	/**
	 * API name: {@code corrupted_repositories}
	 */
	@Nullable
	public final Long corruptedRepositories() {
		return this.corruptedRepositories;
	}

	/**
	 * API name: {@code corrupted}
	 */
	public final List<String> corrupted() {
		return this.corrupted;
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

		if (this.totalRepositories != null) {
			generator.writeKey("total_repositories");
			generator.write(this.totalRepositories);

		}
		if (this.corruptedRepositories != null) {
			generator.writeKey("corrupted_repositories");
			generator.write(this.corruptedRepositories);

		}
		if (ApiTypeHelper.isDefined(this.corrupted)) {
			generator.writeKey("corrupted");
			generator.writeStartArray();
			for (String item0 : this.corrupted) {
				generator.write(item0);

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
	 * Builder for {@link RepositoryIntegrityIndicatorDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RepositoryIntegrityIndicatorDetails> {
		@Nullable
		private Long totalRepositories;

		@Nullable
		private Long corruptedRepositories;

		@Nullable
		private List<String> corrupted;

		/**
		 * API name: {@code total_repositories}
		 */
		public final Builder totalRepositories(@Nullable Long value) {
			this.totalRepositories = value;
			return this;
		}

		/**
		 * API name: {@code corrupted_repositories}
		 */
		public final Builder corruptedRepositories(@Nullable Long value) {
			this.corruptedRepositories = value;
			return this;
		}

		/**
		 * API name: {@code corrupted}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>corrupted</code>.
		 */
		public final Builder corrupted(List<String> list) {
			this.corrupted = _listAddAll(this.corrupted, list);
			return this;
		}

		/**
		 * API name: {@code corrupted}
		 * <p>
		 * Adds one or more values to <code>corrupted</code>.
		 */
		public final Builder corrupted(String value, String... values) {
			this.corrupted = _listAdd(this.corrupted, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RepositoryIntegrityIndicatorDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RepositoryIntegrityIndicatorDetails build() {
			_checkSingleUse();

			return new RepositoryIntegrityIndicatorDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RepositoryIntegrityIndicatorDetails}
	 */
	public static final JsonpDeserializer<RepositoryIntegrityIndicatorDetails> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					RepositoryIntegrityIndicatorDetails::setupRepositoryIntegrityIndicatorDetailsDeserializer);

	protected static void setupRepositoryIntegrityIndicatorDetailsDeserializer(
			ObjectDeserializer<RepositoryIntegrityIndicatorDetails.Builder> op) {

		op.add(Builder::totalRepositories, JsonpDeserializer.longDeserializer(), "total_repositories");
		op.add(Builder::corruptedRepositories, JsonpDeserializer.longDeserializer(), "corrupted_repositories");
		op.add(Builder::corrupted, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"corrupted");

	}

}
