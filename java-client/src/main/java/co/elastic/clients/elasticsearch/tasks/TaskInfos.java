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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.List;
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

// typedef: tasks._types.TaskInfos

/**
 *
 * @see <a href="../doc-files/api-spec.html#tasks._types.TaskInfos">API
 *      specification</a>
 */
@JsonpDeserializable
public class TaskInfos implements TaggedUnion<TaskInfos.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Flat, Grouped

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	private TaskInfos(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private TaskInfos(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static TaskInfos of(Function<Builder, ObjectBuilder<TaskInfos>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code flat}?
	 */
	public boolean isFlat() {
		return _kind == Kind.Flat;
	}

	/**
	 * Get the {@code flat} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code flat} kind.
	 */
	public List<TaskInfo> flat() {
		return TaggedUnionUtils.get(this, Kind.Flat);
	}

	/**
	 * Is this variant instance of kind {@code grouped}?
	 */
	public boolean isGrouped() {
		return _kind == Kind.Grouped;
	}

	/**
	 * Get the {@code grouped} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code grouped} kind.
	 */
	public Map<String, ParentTaskInfo> grouped() {
		return TaggedUnionUtils.get(this, Kind.Grouped);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Flat :
					generator.writeStartArray();
					for (TaskInfo item0 : ((List<TaskInfo>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case Grouped :
					generator.writeStartObject();
					for (Map.Entry<String, ParentTaskInfo> item0 : ((Map<String, ParentTaskInfo>) this._value)
							.entrySet()) {
						generator.writeKey(item0.getKey());
						item0.getValue().serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TaskInfos> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<TaskInfos> flat(List<TaskInfo> v) {
			this._kind = Kind.Flat;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TaskInfos> grouped(Map<String, ParentTaskInfo> v) {
			this._kind = Kind.Grouped;
			this._value = v;
			return this;
		}

		public TaskInfos build() {
			_checkSingleUse();
			return new TaskInfos(this);
		}

	}

	private static JsonpDeserializer<TaskInfos> buildTaskInfosDeserializer() {
		return new UnionDeserializer.Builder<TaskInfos, Kind, Object>(TaskInfos::new, false)
				.addMember(Kind.Flat, JsonpDeserializer.arrayDeserializer(TaskInfo._DESERIALIZER))
				.addMember(Kind.Grouped, JsonpDeserializer.stringMapDeserializer(ParentTaskInfo._DESERIALIZER)).build();
	}

	public static final JsonpDeserializer<TaskInfos> _DESERIALIZER = JsonpDeserializer
			.lazy(TaskInfos::buildTaskInfosDeserializer);
}
