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

package co.elastic.clients.elasticsearch.tasks;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: tasks._types.ParentTaskInfo

/**
 *
 * @see <a href="../doc-files/api-spec.html#tasks._types.ParentTaskInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class ParentTaskInfo extends TaskInfo {
	private final List<TaskInfo> children;

	// ---------------------------------------------------------------------------------------------

	private ParentTaskInfo(Builder builder) {
		super(builder);

		this.children = ApiTypeHelper.unmodifiable(builder.children);

	}

	public static ParentTaskInfo of(Function<Builder, ObjectBuilder<ParentTaskInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code children}
	 */
	public final List<TaskInfo> children() {
		return this.children;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.children)) {
			generator.writeKey("children");
			generator.writeStartArray();
			for (TaskInfo item0 : this.children) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ParentTaskInfo}.
	 */

	public static class Builder extends TaskInfo.AbstractBuilder<Builder> implements ObjectBuilder<ParentTaskInfo> {
		@Nullable
		private List<TaskInfo> children;

		/**
		 * API name: {@code children}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>children</code>.
		 */
		public final Builder children(List<TaskInfo> list) {
			this.children = _listAddAll(this.children, list);
			return this;
		}

		/**
		 * API name: {@code children}
		 * <p>
		 * Adds one or more values to <code>children</code>.
		 */
		public final Builder children(TaskInfo value, TaskInfo... values) {
			this.children = _listAdd(this.children, value, values);
			return this;
		}

		/**
		 * API name: {@code children}
		 * <p>
		 * Adds a value to <code>children</code> using a builder lambda.
		 */
		public final Builder children(Function<TaskInfo.Builder, ObjectBuilder<TaskInfo>> fn) {
			return children(fn.apply(new TaskInfo.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ParentTaskInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ParentTaskInfo build() {
			_checkSingleUse();

			return new ParentTaskInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ParentTaskInfo}
	 */
	public static final JsonpDeserializer<ParentTaskInfo> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ParentTaskInfo::setupParentTaskInfoDeserializer);

	protected static void setupParentTaskInfoDeserializer(ObjectDeserializer<ParentTaskInfo.Builder> op) {
		TaskInfo.setupTaskInfoDeserializer(op);
		op.add(Builder::children, JsonpDeserializer.arrayDeserializer(TaskInfo._DESERIALIZER), "children");

	}

}
