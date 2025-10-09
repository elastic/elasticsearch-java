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
import co.elastic.clients.util.NamedValue;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: project.tags.ProjectTags

/**
 *
 * @see <a href="../../doc-files/api-spec.html#project.tags.ProjectTags">API
 *      specification</a>
 */

public abstract class ProjectTags implements JsonpSerializable {
	private final NamedValue<Tags> origin;

	private final Map<String, Tags> linkedProjects;

	// ---------------------------------------------------------------------------------------------

	protected ProjectTags(AbstractBuilder<?> builder) {

		this.origin = ApiTypeHelper.requireNonNull(builder.origin, this, "origin");
		this.linkedProjects = ApiTypeHelper.unmodifiable(builder.linkedProjects);

	}

	/**
	 * Required - API name: {@code origin}
	 */
	public final NamedValue<Tags> origin() {
		return this.origin;
	}

	/**
	 * API name: {@code linked_projects}
	 */
	public final Map<String, Tags> linkedProjects() {
		return this.linkedProjects;
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

		generator.writeKey("origin");
		generator.writeStartObject();
		generator.writeKey(this.origin.name());
		this.origin.value().serialize(generator, mapper);

		generator.writeEnd();

		if (ApiTypeHelper.isDefined(this.linkedProjects)) {
			generator.writeKey("linked_projects");
			generator.writeStartObject();
			for (Map.Entry<String, Tags> item0 : this.linkedProjects.entrySet()) {
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

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private NamedValue<Tags> origin;

		@Nullable
		private Map<String, Tags> linkedProjects;

		/**
		 * Required - API name: {@code origin}
		 */
		public final BuilderT origin(NamedValue<Tags> value) {
			this.origin = value;
			return self();
		}

		/**
		 * Required - API name: {@code origin}
		 */
		public BuilderT origin(String name, Tags value) {
			this.origin = new NamedValue(name, value);
			return self();
		}

		/**
		 * Required - API name: {@code origin}
		 */
		public BuilderT origin(String name, Function<Tags.Builder, ObjectBuilder<Tags>> fn) {
			return this.origin(name, fn.apply(new Tags.Builder()).build());
		}

		/**
		 * API name: {@code linked_projects}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>linkedProjects</code>.
		 */
		public final BuilderT linkedProjects(Map<String, Tags> map) {
			this.linkedProjects = _mapPutAll(this.linkedProjects, map);
			return self();
		}

		/**
		 * API name: {@code linked_projects}
		 * <p>
		 * Adds an entry to <code>linkedProjects</code>.
		 */
		public final BuilderT linkedProjects(String key, Tags value) {
			this.linkedProjects = _mapPut(this.linkedProjects, key, value);
			return self();
		}

		/**
		 * API name: {@code linked_projects}
		 * <p>
		 * Adds an entry to <code>linkedProjects</code> using a builder lambda.
		 */
		public final BuilderT linkedProjects(String key, Function<Tags.Builder, ObjectBuilder<Tags>> fn) {
			return linkedProjects(key, fn.apply(new Tags.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupProjectTagsDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::origin, NamedValue.deserializer(() -> Tags._DESERIALIZER), "origin");
		op.add(AbstractBuilder::linkedProjects, JsonpDeserializer.stringMapDeserializer(Tags._DESERIALIZER),
				"linked_projects");

	}

}
