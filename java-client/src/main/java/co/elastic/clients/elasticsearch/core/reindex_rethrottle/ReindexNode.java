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

package co.elastic.clients.elasticsearch.core.reindex_rethrottle;

import co.elastic.clients.elasticsearch._types.BaseNode;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: _global.reindex_rethrottle.ReindexNode

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.reindex_rethrottle.ReindexNode">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReindexNode extends BaseNode {
	private final Map<String, ReindexTask> tasks;

	// ---------------------------------------------------------------------------------------------

	private ReindexNode(Builder builder) {
		super(builder);

		this.tasks = ApiTypeHelper.unmodifiableRequired(builder.tasks, this, "tasks");

	}

	public static ReindexNode of(Function<Builder, ObjectBuilder<ReindexNode>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code tasks}
	 */
	public final Map<String, ReindexTask> tasks() {
		return this.tasks;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.tasks)) {
			generator.writeKey("tasks");
			generator.writeStartObject();
			for (Map.Entry<String, ReindexTask> item0 : this.tasks.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReindexNode}.
	 */

	public static class Builder extends BaseNode.AbstractBuilder<Builder> implements ObjectBuilder<ReindexNode> {
		private Map<String, ReindexTask> tasks;

		/**
		 * Required - API name: {@code tasks}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>tasks</code>.
		 */
		public final Builder tasks(Map<String, ReindexTask> map) {
			this.tasks = _mapPutAll(this.tasks, map);
			return this;
		}

		/**
		 * Required - API name: {@code tasks}
		 * <p>
		 * Adds an entry to <code>tasks</code>.
		 */
		public final Builder tasks(String key, ReindexTask value) {
			this.tasks = _mapPut(this.tasks, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code tasks}
		 * <p>
		 * Adds an entry to <code>tasks</code> using a builder lambda.
		 */
		public final Builder tasks(String key, Function<ReindexTask.Builder, ObjectBuilder<ReindexTask>> fn) {
			return tasks(key, fn.apply(new ReindexTask.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ReindexNode}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReindexNode build() {
			_checkSingleUse();

			return new ReindexNode(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReindexNode}
	 */
	public static final JsonpDeserializer<ReindexNode> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReindexNode::setupReindexNodeDeserializer);

	protected static void setupReindexNodeDeserializer(ObjectDeserializer<ReindexNode.Builder> op) {
		BaseNode.setupBaseNodeDeserializer(op);
		op.add(Builder::tasks, JsonpDeserializer.stringMapDeserializer(ReindexTask._DESERIALIZER), "tasks");

	}

}
